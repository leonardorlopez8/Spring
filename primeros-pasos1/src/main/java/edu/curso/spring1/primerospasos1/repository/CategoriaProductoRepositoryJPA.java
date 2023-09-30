package edu.curso.spring1.primerospasos1.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.curso.spring1.primerospasos1.bo.CategoriaProducto;

@Repository
public class CategoriaProductoRepositoryJPA implements CategoriaProductoRepository {

@Autowired
private EntityManager entityManager;
	
	@Override
	public Long altaCategoriaProducto(CategoriaProducto categoriaProducto) {
		entityManager.persist(categoriaProducto);
		return categoriaProducto.getId();

	}	
	@Override
	public CategoriaProducto buscarCategoriaProductoPorId(Long id) {
		return entityManager.find(CategoriaProducto.class, id); 

	}	
	@Override
	public List<CategoriaProducto> buscarCategoriasProducto(){
		TypedQuery<CategoriaProducto> query = entityManager.createQuery("select c from CategoriaProducto c",CategoriaProducto.class );
		return query.getResultList();
	}	
	
}
