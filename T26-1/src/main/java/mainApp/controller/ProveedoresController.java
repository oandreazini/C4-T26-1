package mainApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mainApp.dto.Proveedores;
import mainApp.service.ProveedoresServiceImpl;


@RestController
@RequestMapping("/api")
public class ProveedoresController {
	
	@Autowired
	ProveedoresServiceImpl proveedoresServiceImpl;
	
	@GetMapping("/proveedores")
	public List<Proveedores> listProveedores() {
		return proveedoresServiceImpl.listProveedores();
	}

	@PostMapping("/proveedores")
	public Proveedores saveProveedores(@RequestBody Proveedores proveedores) {

		return proveedoresServiceImpl.saveProveedores(proveedores);
	}

	@GetMapping("/proveedores/{codigo}")
	public Proveedores proveedoresXID(@PathVariable(name = "codigo") int codigo) {
	
		return proveedoresServiceImpl.proveedoresXID(codigo);

	}

	@PutMapping("/proveedores/{codigo}")
	public Proveedores updateProveedores(@PathVariable(name = "codigo") int codigo, @RequestBody Proveedores proveedores) {

		Proveedores proveedores_select;
		Proveedores proveedores_update;

		proveedores_select = proveedoresServiceImpl.proveedoresXID(codigo);
		
		proveedores_select.setNombre(proveedores.getNombre());
		proveedores_select.setSuministra(proveedores.getSuministra());
		
		proveedores_update = proveedoresServiceImpl.updateProveedores(proveedores_select);

		System.out.println("El proveedores actualizado es: " + proveedores_update);

		return proveedores_update;
	}

	@DeleteMapping("/proveedores/{codigo}")
	public void deleteProveedores(@PathVariable(name = "codigo") int codigo) {
		proveedoresServiceImpl.deleteProveedores(codigo);
	}


}
