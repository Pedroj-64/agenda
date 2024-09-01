package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.Collection;

public class Grupo {
    private String nombre;
    private Categoria categoria;
    public Collection<Contacto> grupo;

    /**
     * Metodo constructor de la clase Grupo
     * 
     * @param nombre
     * @param categoria
     */
    public Grupo(String nombre, Categoria categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
        grupo = new ArrayList<>();

    }

    /**
     * Metodos setters && getters de la clase
     * 
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Collection<Contacto> getGrupo() {
        return grupo;
    }

    public void setContactos(Collection<Contacto> grupo) {
        this.grupo = grupo;
    }

    /**
     * Metodo para verificar que ningun contacto creado se duplique dentro de grupo
     * 
     * @param nombre
     * @param telefono
     * @return
     */
    public boolean verificarContactos(String nombre, String telefono) {
        boolean centinela = true;
        for (Contacto contacto : grupo) {
            if (contacto.getTelefono().equals(telefono) && contacto.getNombre().equals(nombre)) {
                centinela = false;
                break;
            }

        }
        return centinela;
    }

    /**
     * Metodos para agragar contactos a un grupo con restruccion de 5 en la
     * coleccion
     * 
     * @param contacto
     * @return
     */
    public String agregarContacto(Contacto contacto) {
        String mensaje = "El grupo al que intenta añadir el contacto tiene capacidad maxima alcanzada o el contacto que intenta añadir esta duplicado";
        if (grupo.size() <= 5) {
            if (verificarContactos(contacto.getNombre(), contacto.getTelefono()) == true) {
                grupo.add(contacto);
            }
        }
        return mensaje;
    }

    /**
     * Metodo para eliminar contactos del grupo por medio del numero telefonico
     * 
     * @param telefono
     * @return
     */
    public String eliminarContactos(String telefono) {
        String mensaje = "No se encuentra el contacto que quiere eliminar";
        for (Contacto contacto : grupo) {
            if (contacto.getTelefono().equals(telefono)) {
                mensaje = "El contacto fue eliminado exitosamente";
                grupo.remove(contacto);
                break;
            }

        }
        return mensaje;
    }

    /**
     * Metodo toString para modelado de codigo
     */
    @Override
    public String toString() {
        return "Grupo [nombre=" + nombre + ", categoria=" + categoria + ", grupo=" + grupo + "]";
    }

}
