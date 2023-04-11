package org.iesalandalus.programacion.alquilervehiculos.modelo.dominio;
;

public class Autobus extends  Vehiculo {

	
	private int Factor_Plazas;
	private int plazas;
	
	public Autobus(String marca, String modelo, int plazas, String matricula) {
		setplazas(plazas);
	}
	
	
	public Autobus(Autobus autobus) {
		return autobus;
	}
	
	
	public int getplazas() {
		return plazas;
	}
	
	private setplazas(int plazas) {
	if(!plazas.matches(Factor_Plazas)) {
			throw new IllegalArgumentException("Error: las plazas no son correctas");
			
			this.plazas=plazas;
		
		}
	}
	
	public int getFactorPrecio() {
		return FactorPrecio;
		
	}
	
	
	@Override
	
	public String toString() {
		return"  autobus:" + autobus+ "Plazas:" +plazas+;
		
	}
	
}
