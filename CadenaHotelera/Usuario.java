package CadenaHotelera;

import java.util.*;

public abstract class Usuario {
	
	private int idUsuario;
	private String nombre;
	private String email;
	private String password;
	private String telefono;
	
	
	public Usuario(int idUsuario, String nombre, String email, String password, String telefono) {
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.email = email;
		this.password = password;
		this.telefono = telefono;
	}//constructor

	public static boolean iniciarSesion(String email, String password, List<Usuario> usuarios ) {
		boolean inicioSesion = false;
		for (Usuario u : usuarios) {
            if (u.email.equals(email) && u.password.equals(password)) {
                System.out.println("Inicio de sesión exitoso: " + u.nombre);
                inicioSesion = true;
            }//if
        }//for
        System.out.println("Credenciales incorrectas");
		return inicioSesion;
	}//iniciarSesion
	
	public static void cerrarSesion(String nombre) {
		System.out.println("El usuario " + nombre + " ha cerrado sesión.");
	}//cerrarSesion
	
}
