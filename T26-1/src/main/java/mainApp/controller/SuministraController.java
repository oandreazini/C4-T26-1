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

import mainApp.dto.Suministra;
import mainApp.service.SuministraServiceImpl;


@RestController
@RequestMapping("/api")
public class SuministraController {
	
	@Autowired
	SuministraServiceImpl suministraServiceImpl;
	
	@GetMapping("/suministra")
	public List<Suministra> listSuministra() {
		return suministraServiceImpl.listSuministra();
	}

	@PostMapping("/suministra")
	public Suministra saveSuministra(@RequestBody Suministra suministra) {

		return suministraServiceImpl.saveSuministra(suministra);
	}

	@GetMapping("/suministra/{id}")
	public Suministra suministraXID(@PathVariable(name = "id") int id) {
	
		return suministraServiceImpl.suministraXID(id);

	}

	@PutMapping("/suministra/{id}")
	public Suministra updateSuministra(@PathVariable(name = "codigo") int id, @RequestBody Suministra suministra) {

		Suministra suministra_select;
		Suministra suministra_update;

		suministra_select = suministraServiceImpl.suministraXID(id);
		
		suministra_select.setPiezas(suministra.getPiezas());
		suministra_select.setProveedores(suministra.getProveedores());
		suministra_select.setPrecio(suministra.getPrecio());
		
			
		suministra_update = suministraServiceImpl.updateSuministra(suministra_select);

		System.out.println("El suministra actualizado es: " + suministra_update);

		return suministra_update;
	}

	@DeleteMapping("/suministra/{id}")
	public void deleteSuministra(@PathVariable(name = "id") int id) {
		suministraServiceImpl.deleteSuministra(id);
	}

}
