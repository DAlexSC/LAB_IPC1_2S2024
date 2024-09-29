import Swal from 'sweetalert2';
import withReactContent from 'sweetalert2-react-content';
import axiosInstance from '@/helpers/axiosConfig';
import axios from 'axios';

const MySwal = withReactContent(Swal);

export const handleAxiosMsg = (response, icon_response = "success") => {
  return new Promise((resolve) => {
    const Toast = MySwal.mixin({
      toast: true,
      position: "bottom-end",
      showConfirmButton: false,
      timer: 4000,
      timerProgressBar: true,
      didOpen: (toast) => {
        toast.onmouseenter = MySwal.stopTimer;
        toast.onmouseleave = MySwal.resumeTimer;
        resolve();
      }
    });
    Toast.fire({
      icon: icon_response,
      title: "Hecho",
      text: response
    });
  });
}

export const handleAxiosError = (error) => {

  if (axiosInstance.isAxiosError(error) && error.response) {

    const message = Array.isArray(error.response.data.message) ? error.response.data.message.map((element, index) => `<li key=${index}>${element}</li>`).join('') : error.response.data.message;
    MySwal.fire({
      title: 'Aviso',
      html: message,
      icon: 'warning'
    });
  } else if (error instanceof Error) {
    MySwal.fire({
      title: 'Error',
      text: error.message,
      icon: 'error'
    });
  }
};

export const handleSwal = () => {
  return MySwal;
}

axios.defaults.baseURL = "http://localhost:5000";
axios.defaults.headers.common['Accept'] = 'application/json';
axios.defaults.headers.common['Content-Type'] = 'application/json';

export default axios;