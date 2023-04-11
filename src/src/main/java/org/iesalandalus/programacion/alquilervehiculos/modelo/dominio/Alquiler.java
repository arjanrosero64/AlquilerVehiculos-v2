//Arjan Rosero Rodríguez 1ºDAM
package org.iesalandalus.programacion.alquilervehiculos.modelo.dominio;

public class Alquiler {

	private int Precio_Dia;
	private LocalDate fechaAlquiler;
	private LocalDate fechaDevolución;

	public Alquiler(cliente:Cliente, turismo:Turismo, LocalDate fecha alquiler ) {
		
	}

	public Aquiler(Alquiler alquiler) {
		if (alquiler==null) {
			throw new NullPointerException("Error: No es posible alquilar un alquiler nulo");
		}
        fechaAlquiler = Alquiler.getfechaAlquiler();
        fechaDevolucion = Alquiler.getfechaDevolucion();
	}

	public LocalDate getfechaAlquiler() {
		return fechaAlquiler;
	}

	private  setfechaAlquiler(LocalDate fechaAlquiler) {
		if (fechaAlquiler==null){
			throw new NullPointedException("Error: la fecha de alquiler no puede ser nula.");
			}
		if(fechaAlquiler>Date now) {
			throw new IllegalArgumentException("Error: la fecha de alquiler no puede ser futura.");
			
		}
		this.fechaAlquiler = fechaAquiler;
		
		}

	public LocalDate getfechaDevolucion() {
		return fechaDevolucion;
	}

	private setfechaDevolucion(LocalDate fechaDevolucion) {
		if (fechaDevolucion==null) {
			throw new NullPointerException("Error: la fecha de devolución no puede ser nula.");
			
		}
		if (fechaDevolucion<fechaAlquiler) {
			throw new IllegalArgumentException("Error: la fecha de devolución debe ser posterior a la fecha de alquiler.");
			
		}
		this.fechaDevolución=fechaDevolucion;
	if (fechaDevolucion>Date now) {
		throw new IllegalArgumentException("Error: La fecha de devolución no puede ser futura.");
	}
	
	}
	
	public  devolver(LocalDate fechaDevolucion) {
		
	}
	
	public int getPrecio() {
		return precio;
		
	}
	

	
}
