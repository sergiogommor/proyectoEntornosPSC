package AlquilerBicicletas;

import java.util.ArrayList;

public class Usa {

    public static void main(String[] args) {

        ArrayList<Estacion> estaciones = new ArrayList<>();

        // ADMINISTRADOR (crea al administrador con los datos)
        Administrador admin = new Administrador("Paula", "Rodriguez", "12345678A", "admin@gmail.com", 666666666);

        // CREAR ESTACION (admin)
        Estacion estacion1 = new Estacion("Centro", 10);

        admin.añadirEstacion(estaciones, estacion1);

        // REGISTRAR BICICLETA (admin)
        Bicicleta bici1 = new Bicicleta(1);

        admin.registrarBicicleta(estacion1, bici1);

        
        
        // USUARIO (crea al usuario con los datos)
        Usuario user = new Usuario("Candela", "Crespo", "11111111B", "candela@gmail.com", 777777777);

        // RECARGAR SALDO (user)
        user.recargarSaldo(20);

        // CONSULTAR ESTACIONES (user)
        System.out.println("Estación: " + estacion1.getUbicacion());

        // ALQUILAR BICICLETA (user)
        Bicicleta biciDisponible = estacion1.obtenerBicicletaDisponible();

        if(biciDisponible != null && user.getSaldo() >= 5) {  //comprobar saldo

            biciDisponible.setEstado("Alquilada");  //si hay saldo

            //ALQUILER (crea los datos del alquiler)
            Alquiler alquiler = new Alquiler(user, biciDisponible, "Centro", "Universidad", 5);

            user.agregarAlquiler(alquiler);

            System.out.println("Bicicleta alquilada");

            // DEVOLVER BICICLETA (user)
            alquiler.finalizarAlquiler();
        } 
        	else {
        		System.out.println("No se puede alquilar");  //no hay saldo
        }

        // VER HISTORIAL (user)
        user.verHistorial();

        // FAVORITA (user)
        user.marcarFavorita(estacion1);

        // REPORTAR AVERIA (user) (crea el reporte con los datos)
        ReporteAveria reporte = new ReporteAveria(bici1, "La rueda está pinchada");

        reporte.reportar();

        // RETIRAR BICICLETA (admin)
        admin.retirarBicicleta(bici1);
    }
}
