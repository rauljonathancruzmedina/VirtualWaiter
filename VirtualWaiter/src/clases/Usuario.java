
package clases;

import java.io.File;

/**
 *
 * @author John
 */
public class Usuario {
private int id;
private String nombre;
private String clave;
File Foto;
public Usuario(){

}

    public Usuario(int id, String nombre, String clave, File Foto) {
        this.id = id;
        this.nombre = nombre;
        this.clave = clave;
        this.Foto = Foto;
    }

    public Usuario(String nombre, String clave, File Foto) {
        this.nombre = nombre;
        this.clave = clave;
        this.Foto = Foto;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public File getFoto() {
        return Foto;
    }

    public void setFoto(File Foto) {
        this.Foto = Foto;
    }

}
