package edu.curso.spring1.primerospasos1.repository;

import java.util.List;

import edu.curso.spring1.primerospasos1.bo.Proveedor;

public interface ProveedorRepository {
      
	public void altaProveedor(Proveedor proveedor);
    public void actualizarProveedor(Proveedor proveedor);
    public void borrarProveedor(Long id);
    public Proveedor buscarProveedorPorId(Long id);
    public List<Proveedor> buscarProveedores();

	
}