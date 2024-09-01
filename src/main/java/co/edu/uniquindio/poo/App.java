package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
       Contacto ramiro=creacionDeContactos();
       Contacto romero=creacionDeContactos();
       Grupo grupo=creacionDeGrupo();
       Reunion reunion= creacionDeReunion();
       grupo.agregarContacto(ramiro);
       grupo.agregarContacto(romero);
       reunion.agregarGrupoAsistente(grupo.getGrupo());
       mostrarMensaje(reunion);

    }


    public static Contacto creacionDeContactos(){
        Contacto ramiro=new Contacto("Ramiro", "El jujis", "Calle ptm 27 #39-67", "44506", "jujalag@gmail.com");
        return ramiro;

    }
    public static Contacto creacionDeContactos2(){
        Contacto romero=new Contacto("Romero", "El jujis", "Calle ptm 27 #39-67", "44506", "jujalag@gmail.com");
        return romero;

    }

    public static Grupo creacionDeGrupo(){
        Grupo grupo=new Grupo("Los ofinistas bareteros", Categoria.FIESTA);
        return grupo;
    }

    public static Reunion creacionDeReunion(){
        Reunion reunion=new Reunion("Proxima fiesta del pitas", "12 de diciembre 2004", "8:00AM");
        return reunion;
    }

    public static void mostrarMensaje(Reunion reunion){
       System.out.println(reunion);
    }

}
