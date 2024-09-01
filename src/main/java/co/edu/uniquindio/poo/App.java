package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    /**
     * Metodo main para ejeccion de codigo
     * 
     * @param args
     */
    public static void main(String[] args) {
        Contacto esteban = creacionDeContactos();
        Contacto ana = creacionDeContacto2();
        Contacto carlos = creacionDeContacto3();
        Contacto carlos2 = creacionDeContacto4();
        Grupo grupo = creacionDeGrupo();
        grupo.agregarContacto(esteban);
        grupo.agregarContacto(ana);
        grupo.agregarContacto(carlos);
        grupo.agregarContacto(carlos2); // muestra de que un contacto repetido no existe en el mismo codigo
        mensajeAviso();
        mostrarMensaje(grupo.toString());
        grupo.eliminarContactos("555-9876");// muestra de como se ve un cuando un contacto es eliminado (ana)
        mensajeAviso();
        mostrarMensaje(grupo.toString());
        Reunion reunion = creacionDeReunion();
        reunion.agregarAsistente(ana);// agregacion de contacto a reunion manual
        reunion.agregarGrupoAsistente(grupo.getGrupo());
        mensajeAviso();
        mostrarMensaje(reunion.toString());
        reunion.eliminarAsistente(carlos);// eliminacion de asistente de mandera manual
        mensajeAviso();
        mostrarMensaje(reunion.toString());

    }

    /**
     * Se crean tres contactos para la prueba del codigo
     * 
     * @return
     */
    public static Contacto creacionDeContactos() {
        Contacto esteban = new Contacto("Esteban", "El esteby", "calle 27 #34-89", "488544", "esteban@temu.com");
        return esteban;

    }

    public static Contacto creacionDeContacto2() {
        Contacto ana = new Contacto("Ana García", "AnaG", "Calle Principal 123", "555-9876", "ana@example.com");
        return ana;
    }

    public static Contacto creacionDeContacto3() {
        Contacto carlos = new Contacto("Carlos Martínez", "CMar", "Avenida Central 456", "555-5432",
                "carlos@example.com");
        return carlos;
    }

    public static Contacto creacionDeContacto4() {
        Contacto carlos = new Contacto("Carlos Martínez", "CMar", "Avenida Central 456", "555-5432",
                "carlos@example.com");
        return carlos;
    }

    /**
     * Creacion de grupo para almacenar contactos segun se de
     * 
     * @return
     */
    public static Grupo creacionDeGrupo() {

        Grupo grupo = new Grupo("Los ofinistas Crazis", Categoria.FIESTA);
        return grupo;
    }

    /**
     * Creacion de reunion
     * 
     * @return
     */
    public static Reunion creacionDeReunion() {
        Reunion reunion = new Reunion("Proxima fiesta del pitas", "12 de diciembre 2004", "8:00AM");
        return reunion;
    }
    /**
     * mensaje para hacer mostrar pruebas al imprimirm de mejor forma
     */
    public static void mensajeAviso() {
        System.out.println("Se analiza la proxima prueba de la siguiente manera : \n" );
    }

    /**
     * metodo para mostrar cualquier mensaje
     * 
     * @param mensaje
     */
    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

}
