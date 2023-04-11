package org.iesalandalus.programacion.alquilervehiculos.modelo.negocio;

public class Clientes {

	public Clientes() {
		Clientes = new ArrayList<>();

	}

	public List<Cliente> getCliente() {
		ArrayList<Cliente> Copiaclientes = new ArrayList<>();
		return Cliente;
	}

	public int getCantidad() {
		return ArrayList<>();
	}

	public insertar(Cliente cliente) {
		if (cliente==null) {
			throw new NullPointedException("Error: No se puede insertar un cliente nulo.");
		}
		
		if (!Cliente.contains(cliente)) {
			Cliente.add(cliente);
		}else {
			throw new OperationNotSupportedException("Error:Ya existe un cliente con ese dni.");
		}
		
		
	}

	public Cliente buscar(Cliente cliente) {
		if (cliente) {
			return Cliente;
		} else {
			throw new NullPointerException("Error:No se puede buscar ningún cliente nulo.");
		}
	}

	public borrar(Cliente cliente) {
		if (cliente) {
			    cliente;
		}else {
			throw new NullPointedException("Error:No se puede borrar ningún cliente nulo.");
		}
		
	}

	public modificar(Cliente cliente, String nombre, String telefono) {
		if (nombre==null | telefono==null) {
			throw new NullPointedException("Error: No se puede modificar un cliente nulo.");
		}
		if (!Cliente.contains(cliente)) {
		throw new OperationNotSupportedException("Error:No existe ningún cliente con ese DNI.");
	}

}
