package co.edu.uniquindio.poo;

import java.sql.Date;
import java.sql.Time;
import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Reunion {
    private String descripcion;
    private Date fecha;
    private Time hora;
    private Collection<Contacto> contactosAsistentes;

    public Reunion(String descripcion, Date fecha, Time hora) {
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hora = hora;
        this.contactosAsistentes = new ArrayList<>();
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Time getHora() {
        return hora;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public Collection<Contacto> getContactosAsistentes() {
        return contactosAsistentes;
    }

    public void setContactosAsistentes(Collection<Contacto> contactosAsistentes) {
        this.contactosAsistentes = contactosAsistentes;
    }

    public String agregarAsistente(Contacto contacto){
        String mensaje="El contacto que intenta agregar ya existe dentro de esta reunion";
            if(!contactosAsistentes.contains(contacto)){
                contactosAsistentes.add(contacto);
                mensaje="El contacto fue exitosamente agregado para asistir a la reunion";
            }
        return mensaje;
        
    }

    public void agregarGrupoAsistente(Collection<Contacto> grupo){
        contactosAsistentes.addAll(grupo);
    }
    @Override
    public String toString() {
        return "Reunion [descripcion=" + descripcion + ", fecha=" + fecha + ", hora=" + hora + ", contactosAsistentes="
                + contactosAsistentes + "]";
    }

}
