package edu.curso.spring1.primerospasos1.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.curso.spring1.primerospasos1.bo.Proveedor;
import edu.curso.spring1.primerospasos1.rest.dto.ProveedorDTO;
import edu.curso.spring1.primerospasos1.service.ProveedorService;

@RestController
@RequestMapping("/api/proveedores")
public class ProveedorRestController {
	@Autowired
	private ProveedorService proveedorService;

	@GetMapping
	public List<ProveedorDTO> buscarProveedores() {
		List<Proveedor> proveedores = proveedorService.buscarProveedores();
		List<ProveedorDTO> proveedoresDTO = new ArrayList<ProveedorDTO>();
		for (Proveedor p : proveedores) {
			proveedoresDTO.add(new ProveedorDTO(p));
		}
		return proveedoresDTO;
	}

	@PostMapping
	public ProveedorDTO altaDeNuevoProveedor(@RequestBody ProveedorDTO proveedorDTO) {
		Proveedor proveedor = new Proveedor();
		proveedor.setNombre(proveedorDTO.getNombre());
		proveedor.setDireccion(proveedorDTO.getDireccion());
		proveedorService.altaDeNuevoProveedor(proveedor);
		return proveedorDTO;
	}

}
