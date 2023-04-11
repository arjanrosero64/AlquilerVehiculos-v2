package org.iesalandalus.programacion.alquilervehiculos.modelo.dominio;

import java.util.Objects;

public class Cliente {

	private String nombre;
	private String dni;
	private String telefono;

	private static final String ER_NOMBRE = "[A-Z][a-z]+( [A-Z][a-z]+)*";

	private static final String ER_DNI = "(\\d{8}(A-Za-z])";

	private static final String ER_TELEFONO = "(\\d{9})";

	public Cliente(String nombre, String dni, String telefono) {
		setnombre(nombre);
		setDNI(dni);
		setTelefono(telefono);
	}

	public Cliente(Cliente cliente) {
		if (cliente==null) {
			throw new NullPointerException("ERROR: No es posible copiar un cliente nulo.");	
		}
		
		nombre = cliente.getNombre();
		dni = cliente.getDni();
		telefono = cliente.getTelefono();
	}

	public String getNombre() {
		return nombre;
	}

	public void setnombre(String nombre) {
		if (nombre == null) {

			throw new NullPointerException("ERROR: El nombre no puede ser nulo.");

		}
		if (!nombre.matches(ER_NOMBRE)) {
			throw new IllegalArgumentException("ERROR: El nombre no tiene un formato válido.");
		}

		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	private void setDNI(String dni) {
		if (dni == null) {

			throw new NullPointerException("ERROR: El DNI no puede ser nulo.");
		}

		if (!dni.matches(ER_DNI)) {

			throw new IllegalArgumentException("ERROR: El DNI no tiene un formato válido.");

		}

		this.dni = dni;

	}
	
	
	

	private boolean comprobarLetraDni(String dni) {

		int numeroDni = Integer.parseInt(dni.substring(0, 8));

		char letraDni = (dni.substring(8)).charAt(0);

		char[] Letras_Dni = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V',
				'H', 'L', 'C', 'K', 'E' };

		char letraEsperada = Letras_Dni[numeroDni % 23];

		if (letraEsperada == letraDni) {
			return true;

		}
		
		return false;
		
	}
	
	
	

	
	
}
