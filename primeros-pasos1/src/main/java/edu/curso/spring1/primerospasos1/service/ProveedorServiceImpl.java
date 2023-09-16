package edu.curso.spring1.primerospasos1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.curso.spring1.primerospasos1.bo.Proveedor;
import edu.curso.spring1.primerospasos1.repository.ProveedorRepository;

@Service
@Transactional
public class ProveedorServiceImpl implements ProveedorService {

	@Autowired
	private ProveedorRepository proveedorRepository;

	@Override
	public void altaDeNuevoProveedor(Proveedor proveedor) {
		proveedorRepository.altaProveedor(proveedor);
		}
			
	@Override
	public List<Proveedor> buscarProveedores(){
		return proveedorRepository.buscarProveedores();
		}
		

}
