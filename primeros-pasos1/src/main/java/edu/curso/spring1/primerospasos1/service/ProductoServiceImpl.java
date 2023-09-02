package edu.curso.spring1.primerospasos1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.curso.spring1.primerospasos1.bo.Producto;
import edu.curso.spring1.primerospasos1.repository.ProductoRepository;

@Service
@Transactional
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	private ProductoRepository productoRepository;

	@Override
	public Long altaDeNuevoProducto(Producto producto) {
		productoRepository.save(producto);
		return producto.getId();
	}

}
