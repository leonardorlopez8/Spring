package edu.curso.spring1.primerospasos1.service;

import java.util.List;

import edu.curso.spring1.primerospasos1.bo.Proveedor;

public interface ProveedorService {

	void altaDeNuevoProveedor(Proveedor proveedor);

	List<Proveedor> buscarProveedores();

}