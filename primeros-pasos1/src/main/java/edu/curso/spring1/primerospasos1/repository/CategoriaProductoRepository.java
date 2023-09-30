package edu.curso.spring1.primerospasos1.repository;

import java.util.List;

import edu.curso.spring1.primerospasos1.bo.CategoriaProducto;



public interface CategoriaProductoRepository {

	Long altaCategoriaProducto(CategoriaProducto categoriaProducto);

	CategoriaProducto buscarCategoriaProductoPorId(Long id);

	List<CategoriaProducto> buscarCategoriasProducto();

}