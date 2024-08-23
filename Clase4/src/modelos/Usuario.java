package modelos;

import java.io.Serializable;

/**
 *
 * @author Douglas Soch
 */
public class Usuario implements Serializable{

    String codigo;
    String contrasenia;
    int tipoUsuario; // Si el tipo es 0 es Admin y si es 1 es Investigador

    public Usuario(String codigo, String contrasenia, int tipoUsuario) {
        this.codigo = codigo;
        this.contrasenia = contrasenia;
        this.tipoUsuario = tipoUsuario;
    }

    public Usuario() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public int getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(int tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
}
