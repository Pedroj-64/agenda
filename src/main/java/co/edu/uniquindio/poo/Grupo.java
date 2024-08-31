package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.Collection;

public class Grupo {
    private String nombre;
    private Categoria categoria;
    public Collection<Contacto> grupo;

    public Grupo(String nombre, Categoria categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
        grupo = new ArrayList<>();

    }

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

    public String agregarContacto(Contacto contacto) {
        String mensaje="El grupo al que intenta añadir el contacto tiene capacidad maxima alcanzada o el contacto que intenta añadir esta duplicado";
        if (grupo.size() <= 5) {
            if (verificarContactos(contacto.getNombre(),contacto.getTelefono()) == true) {
                grupo.add(contacto);
            }
        }
        return mensaje;
    }

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

    @Override
    public String toString() {
        return "Grupo [nombre=" + nombre + ", categoria=" + categoria + ", grupo=" + grupo + "]";
    }

}
