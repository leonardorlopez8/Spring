package edu.curso.spring1.primerospasos1.rest.dto;

import edu.curso.spring1.primerospasos1.bo.Proveedor;

public class ProveedorDTO {

	private Long id;
	private String nombre;
	private String direccion;

	public ProveedorDTO() {

	}

	public ProveedorDTO(Proveedor proveedor) {
		this.id = proveedor.getId();
		this.nombre = proveedor.getNombre();
		this.direccion = proveedor.getDireccion();
	}
//getters y setters completos
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	
}
