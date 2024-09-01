package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.Collection;

public class Reunion {
    private String descripcion;
    private String fecha;
    private String hora;
    private Collection<Contacto> contactosAsistentes;

    /**
     * Metodo constructor de la clase reunion
     * 
     * @param descripcion
     * @param fecha
     * @param hora
     */
    public Reunion(String descripcion, String fecha, String hora) {
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hora = hora;
        this.contactosAsistentes = new ArrayList<>();
    }

    /**
     * Metodos setters && getters de la clase
     * 
     * @return
     */
    public String getDescripcion() {
        return descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Collection<Contacto> getContactosAsistentes() {
        return contactosAsistentes;
    }

    public void setContactosAsistentes(Collection<Contacto> contactosAsistentes) {
        this.contactosAsistentes = contactosAsistentes;
    }

    /**
     * Metodo para eliminar contactos asistentes por medio de contacto entero
     * 
     * @param contacto
     * @return
     */
    public String eliminarAsistente(Contacto contacto) {
        String mensaje = "El contacto no está en la lista de asistentes de esta reunión.";
        if (contactosAsistentes.contains(contacto)) {
            contactosAsistentes.remove(contacto);
            mensaje = "El contacto fue eliminado exitosamente de la reunión.";
        }
        return mensaje;
    }

    /**
     * Metodo para agregar contactos de forma manual
     * 
     * @param contacto
     * @return
     */
    public String agregarAsistente(Contacto contacto) {
        String mensaje = "El contacto que intenta agregar ya existe dentro de esta reunion";
        if (!contactosAsistentes.contains(contacto)) {
            contactosAsistentes.add(contacto);
            mensaje = "El contacto fue exitosamente agregado para asistir a la reunion";
        }
        return mensaje;

    }

    /**
     * Metodo para agregar a la reunion grupos de contactos
     * 
     * @param grupo
     */
    public void agregarGrupoAsistente(Collection<Contacto> grupo) {
        contactosAsistentes.addAll(grupo);
    }

    /**
     * metodo toString para modelado de codigo
     */
    @Override
    public String toString() {
        return "Reunion [descripcion=" + descripcion + ", fecha=" + fecha + ", hora=" + hora + ", contactosAsistentes="
                + contactosAsistentes + "]";
    }

}
