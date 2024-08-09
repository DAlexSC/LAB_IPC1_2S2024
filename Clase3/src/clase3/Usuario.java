package clase3;

import java.util.ArrayList;

/**
 *
 * @author Douglas Soch
 */
public class Usuario {

    private ArrayList<Usuario> baseDatos;
    private String nombreUsuario;
    private String contrasenia;
    private String tipoUsuario;

    public Usuario() {
        this.baseDatos = new ArrayList<Usuario>();
    }

    public Usuario(String nombreUsuario, String contrasenia, String tipoUsuario) {        
        this.nombreUsuario = nombreUsuario;
        this.contrasenia = contrasenia;
        this.tipoUsuario = tipoUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        // Se valida que la longitud del nombre de usuario sea mayor o igual 5
        if(nombreUsuario.length() >= 5){
            this.nombreUsuario = nombreUsuario;
        }else{
            throw new IllegalArgumentException("El nombre de usuario debe de tener, por lo menos, 5 caracteres");
        }        
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    
    public void guardarUsuario(Usuario usuario){
        this.baseDatos.add(usuario);
    }
    
    /**
     * Metodo que se encarga de verificar si existe el usuario en la base de datos.
     * Si retorna 'true' es porque existe el usuario.
     */
    public boolean verificarUsuario(String usuario, String contrasenia){
        for (Usuario fila : this.baseDatos) {
            if(fila.getNombreUsuario().equals(usuario) && fila.getContrasenia().equals(contrasenia)){
                return true;
            }
        }       
        return false;
    }
}
