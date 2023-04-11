//Arjan Rosero Rodríguez 1ºDAM
package org.iesalandalus.programacion.alquilervehiculos.modelo.dominio;

import java.util.Objects;

public class Turismo {

	private String marca;
	private String modelo;
	private int cilindrada;
	private String matricula;

	private static final String ER_MARCA = "([Seat,Land Rover,KIA, Rolls-Royce,Ssang Yong])";
	private static final String ER_Cilindrada = "([1-5000])";
	private static final String ER_MATRICULA = "([1-4]{3}{a-z][A-D])";

	public Turismo(String marca, String modelo, int cilindrada, String matricula) {
		setMarca(marca);
		setMatricula(matricula);
		setModelo(modelo);
		setCilindrada(cilindrada);
	}

	public Turismo(Turismo turismo) {
		if (turismo == null) {
			throw new NullPointedException("ERROR: No es posible copiar un turismo nulo.");
		}
		marca = turismo.getMarca();
		modelo = turismo.getModelo();
		cilindrada = turismo.getCilindrada();
		matricula = turismo.getMatricula();
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		if (marca == null) {

			throw new NullPointerException("La marca no puede ser  nula.");
		}

		if (!marca.matches(ER_MARCA)) {
			throw new IllegalArgumentException("Error: La marca no tiene un formato válido.");
			}
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		if (modelo == null) {

			throw new NullPointerException("El modelo no puede ser  nulo.");
		}

	}

	public int getCilindrada() {
		return cilindrada;
		
	}

	public void setCilindrada(int cilindrada) {
		if (cilindrada==ER_Cilindrada){
			throw new IllegalArgumentException("Error: La cilindrada no tiene un formato válido");

		}
       this.cilindrada = cilindrada;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		if (matricula == null) {

			throw new NullPointerException("La matricula no puede ser nula.");
		}

		if (!matricula.matches(ER_MATRICULA)) {
			throw new IllegalArgumentException("Error: la matrícila no tiene un formato válido.");
		}
			this.matricula = matricula;
		
	}

	public static Turismo getTurismoConMatricula(String matricula) {
return new Turismo("Kia","500","2342 NOQ");
	}

	@Override
	public int hashCode() {
		return Objects.hash(cilindrada, marca, matricula, modelo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Turismo other = (Turismo) obj;
		return cilindrada == other.cilindrada && Objects.equals(marca, other.marca)
				&& Objects.equals(matricula, other.matricula) && Objects.equals(modelo, other.modelo);
	}

	@Override
	public String toString() {
		return "Turismo [marca=" + marca + ", modelo=" + modelo + ", cilindrada=" + cilindrada + ", matricula="
				+ matricula + "]";
	}

}
