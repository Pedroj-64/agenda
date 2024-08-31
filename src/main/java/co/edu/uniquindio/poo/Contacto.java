package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.Collection;


public class Contacto {
    private String nombre;
    private String alias;
    private String direccion;
    private String telefono;
    private String email;

    /**
     * Metodo Constructor de la clase
     * 
     * @param nombre
     * @param alias
     * @param direccion
     * @param telefono
     * @param email
     */
    public Contacto(String nombre, String alias, String direccion, String telefono, String email) {
        this.nombre = nombre;
        this.alias = alias;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }


    /**
     * Metodos Setters && Getters de la clase
     * 
     * @return
     */
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    
    @Override
    public String toString() {
        return "Contacto [nombre=" + nombre + ", alias=" + alias + ", direccion=" + direccion + ", telefono=" + telefono
                + ", email=" + email + "]";
    }

}