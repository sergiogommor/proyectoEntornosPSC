package CadenaHotelera;

import java.util.*;

public class UsaCadenaHotelera {

	public static void main(String[] args) {
		
	// Creamos el sistema de reservas
	SistemaReservas sistema1 = new SistemaReservas();
	
	//Creamos las habitaciones
	Habitacion h1 = new Habitacion();
	h1.actualizarPrecio(100);
	h1.setDisponible(true);
	
	Habitacion h2 = new Habitacion();
	h2.actualizarPrecio(200);
	h2.setDisponible(true);
	
	sistema1.getHabitaciones().add(h1);
	sistema1.getHabitaciones().add(h2);
	
	// =========== USO DEL CLIENTE ===========
	
	//Creamos el cliente
	Cliente cliente1 = new Cliente(1, "Juan", "juan@mail.com", "1234", "636739270", "71322990J");
   
	//Creamos monedero
	 Monedero monedero = new Monedero();
     monedero.acumularPuntos(100);
     cliente1.setMonedero(monedero);
     
     //El cliente inicia sesión
     List<Usuario> usuarios = new ArrayList<>();
     usuarios.add(cliente1);

     boolean login = cliente1.iniciarSesion("juan@mail.com", "1234", usuarios);

     if (!login) {
         System.out.println("No se pudo iniciar sesión");
         return;
     }//if
     
     //Consultar disponibilidad de las habitaciones
     List<Habitacion> disponibles = cliente1.consultarHabitacion(sistema1.getHabitaciones());
     System.out.println("Habitaciones disponibles: " + disponibles.size());

     //Realizar reservas
     Habitacion seleccionada = disponibles.get(0);
     Reserva reserva = cliente1.hacerReserva(seleccionada);
     reserva.setFechaInicio(new Date());
     reserva.setFechaFin(new Date(System.currentTimeMillis() + 86400000)); // +1 día
	
     //Añadir servicios: OPCIONAL
     Scanner sc = new Scanner(System.in);
     int opcion;

     do {

         System.out.println("\n===== SERVICIOS ADICIONALES DEL HOTEL =====");
         System.out.println("1. Desayuno buffet - 12.50 €");
         System.out.println("2. Parking privado - 15.00 €");
         System.out.println("3. WiFi premium - 5.99 €");
         System.out.println("4. Traslado al aeropuerto - 40.00 €");
         System.out.println("5. No añadir");

         System.out.print("\nSeleccione un servicio: ");
         opcion = sc.nextInt();

         switch (opcion) {

             case 1:
                 System.out.println("Has seleccionado DESAYUNO BUFFET");
                 for(int i=0; i<reserva.getServicios().size();i++) {
                	 if(!reserva.getServicios().get(i).equals(ServicioAdicional.DESAYUNO)) {
                		 System.out.println("El servicio de " + reserva.getServicios().get(i).getDescripcion() + "Ya ha sido seleccionado");
                	 }else reserva.anadirServicio(ServicioAdicional.DESAYUNO);}
                 break;
                 

             case 2:
                 System.out.println("Has seleccionado PARKING PRIVADO");
                 for(int i=0; i<reserva.getServicios().size();i++) {
                	 if(reserva.getServicios().get(i).equals(ServicioAdicional.PARKING)) {
                		 System.out.println("El servicio de " + reserva.getServicios().get(i).getDescripcion() + "Ya ha sido seleccionado");
                	 }else reserva.anadirServicio(ServicioAdicional.PARKING);}
                 break;

             case 3:
                 System.out.println("Has seleccionado WIFI PREMIUM");
                 for(int i=0; i<reserva.getServicios().size();i++) {
                	 if(reserva.getServicios().get(i).equals(ServicioAdicional.WIFI_PREMIUM)) {
                		 System.out.println("El servicio de " + reserva.getServicios().get(i).getDescripcion() + "Ya ha sido seleccionado");
                	 }else reserva.anadirServicio(ServicioAdicional.WIFI_PREMIUM);}
                 break;

             case 4:
                 System.out.println("Has seleccionado TRASLADO AL AEROPUERTO");
                 for(int i=0; i<reserva.getServicios().size();i++) {
                	 if(reserva.getServicios().get(i).equals(ServicioAdicional.TRASLADO_AEROPUERTO)) {
                		 System.out.println("El servicio de " + reserva.getServicios().get(i).getDescripcion() + "Ya ha sido seleccionado");
                	 }else reserva.anadirServicio(ServicioAdicional.TRASLADO_AEROPUERTO);}
                 break;

             case 5:
                 System.out.println("Saliendo del menú...");
                 break;

             default:
                 System.out.println("Opción no válida");
         }

     } while (opcion != 5);
     
     //Calcular el total de la reserva
     double total = reserva.calcularTotal();
     System.out.println("Total reserva: " + total);
     
     //Realizar el pago
     Pago pago = new Pago();
     pago.setaPagar(total);
     pago.setMetodo("Tarjeta");

     if (pago.procesarPago()) {
         System.out.println("Pago realizado correctamente");
     }//if
     
     //El sistema procesa la reserva
     sistema1.procesarReserva(reserva);
     
     // =========== USO DEL RECEPCIONISTA ===========
     Recepcionista recep = new Recepcionista();
     recep.registrarCheckIn(reserva);

     System.out.println("Check-in realizado");

     recep.registrarCheckOut(reserva);
     System.out.println("Check-out realizado");
     
     // =========== USO DE LAS RESEÑAS ===========
     Resena resena = new Resena();
     resena.anadirRespuesta("Gracias por su visita");
     
     // =========== USO DEL ADMINISTRADOR ===========
     Administrador admin = new Administrador(1, "Iker", "ikerCH@gmail.es", "4321", "982664457", 2 );
     admin.responderResenias(resena, "Esperamos verte de nuevo");
     
	}//main

}//class
