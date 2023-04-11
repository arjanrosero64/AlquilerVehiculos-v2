package package package org.iesalandalus.programacion.alquilervehiculos.modelo.negocio;


public class Turismos {

	public Turismos() {
		Turismos= new ArrayList<>();
	}
	
	public List<Turismos>  get(){
		ArrayList<Turismos> Copiaturismos = new ArrayList<>();
		
	}
	
	
	
	public int getCantidad() {
		
	}
	
	public insertar(Turismos turismo) {
		if (turismo==null) {
			throw new NullPointedException("Error: No se puede insertar un turismo nulo.");
		}
		if (!Turismos.contains(turismo)) {
			Turismos.add(turismo);
		}else {
			throw new OperationNotSupportedException("Error:Ya existe un turismo con esa matrícula.");
		}
	}
	
	public Turismo buscar(Turismo turismo) {
		if(turismo) {
			return turismo;
		}else {
			throw new NullPointedException("Error:No se puede buscar ningún turismo nulo.");
		}
	}
	
	public borrar(Turismo turismo) {
		if(turismo) {
			
			
		}else{
			throw new NullPointedException("Error:No se puede borrar un turismo nulo. ");
			
		}
			
		}
	}
	
	
}
