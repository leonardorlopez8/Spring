package edu.curso.spring1.primerospasos1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import edu.curso.spring1.primerospasos1.bo.Producto;

//JPA REPOSITORY - HQL (Hibernate Query languaje) JPQL (Java Persistence Query Languaje)
//ORM 
// JPQL - HQL - SQL (HIBERNATE TRANSFORMA)
//SPRING BOOT - SPRING DATA JPA - Provee conf necesarias para q hibernate pueda trabajar.

//VS SPRING DATA JPA
@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {

	@Query("SELECT p FROM Producto p ORDER BY p.nombre")
	public List<Producto> buscarProductos();

	@Query("SELECT p FROM Producto p WHERE p.precio >= ?1")
	public List<Producto> buscarProductosPorPrecio(Double precio);

	//@Query("SELECT p FROM Producto p WHERE p.precio >= :precio")
	//public List<Producto> buscarProductosPorPrecioEjemplo(@Param("precio") Double precio);
	
	@Query("SELECT p FROM Producto p WHERE p.nombre LIKE %?1%")
	public List<Producto> buscarProductosPorNombre(String nombre);



	
}
