package edu.curso.spring1.primerospasos1.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.curso.spring1.primerospasos1.bo.Producto;
import edu.curso.spring1.primerospasos1.rest.dto.ProductoDTO;
import edu.curso.spring1.primerospasos1.service.ProductoService;

@RestController
@RequestMapping("/api/productos")
public class ProductosRestController {
    @Autowired
    private ProductoService productoService;
    
    @GetMapping("/{id}")
    public ProductoDTO buscarProductoPorId(@PathVariable Long id) {
    	Producto producto = productoService.buscarProductoPorId(id);
    	return new ProductoDTO(producto);
    }
   
    @GetMapping
    public List<ProductoDTO> buscarProductos(){
    	List<Producto> productos = productoService.recuperarProductos();
    	List<ProductoDTO> productosDTO = new ArrayList<ProductoDTO>();
    	for(Producto p : productos) {
    		productosDTO.add(new ProductoDTO(p));
    	}
    	return productosDTO;
    }
    
    
    @GetMapping("/buscar")
    public List<ProductoDTO> buscarProductosPorNombre(@RequestParam String nombre) {
    List<Producto> productos = productoService.recuperarProductosPorNombre(nombre);
    List<ProductoDTO> productosDTO = new ArrayList<ProductoDTO>();
      for (Producto p : productos) {
      productosDTO.add(new ProductoDTO(p));
     }
    return productosDTO;

    }

    
    @PostMapping
    public ProductoDTO altaDeNuevoProducto(@RequestBody ProductoDTO productoDTO) {
    	Producto producto = new Producto();
    	producto.setNombre(productoDTO.getNombre());
    	producto.setPrecio(productoDTO.getPrecio());
    	Long idGenerado = productoService.altaDeNuevoProducto(producto);
    	productoDTO.setId(idGenerado);
    	return productoDTO;

    }

    @DeleteMapping("/{id}")
    public void borrarProducto(@PathVariable Long id) {
    productoService.borrarProducto(id);
    }

    @PutMapping("/{id}")
    public ProductoDTO actualizarProducto(@PathVariable Long id, @RequestBody ProductoDTO productoDTO) {
    Producto producto = productoService.buscarProductoPorId(id);
    producto.setNombre(productoDTO.getNombre());
    producto.setPrecio(productoDTO.getPrecio());
    productoService.actualizarProducto(producto);
    return productoDTO;
    }

    
}
