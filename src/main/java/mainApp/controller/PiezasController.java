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

import mainApp.dto.Piezas;
import mainApp.service.PiezasServiceImpl;

@RestController
@RequestMapping("/api")
public class PiezasController {
	
	@Autowired
	PiezasServiceImpl piezasServideImpl;
	
	@GetMapping("/piezas")
	public List<Piezas> listPiezas() {
		return piezasServideImpl.listPiezas();
	}

	@PostMapping("/piezas")
	public Piezas savePiezas(@RequestBody Piezas piezas) {

		return piezasServideImpl.savePiezas(piezas);
	}

	@GetMapping("/piezas/{codigo}")
	public Piezas piezasXID(@PathVariable(name = "codigo") int codigo) {
	
		return piezasServideImpl.piezasXID(codigo);

	}

	@PutMapping("/piezas/{codigo}")
	public Piezas updatePiezas(@PathVariable(name = "codigo") int codigo, @RequestBody Piezas piezas) {

		Piezas piezas_select;
		Piezas piezas_update;

		piezas_select = piezasServideImpl.piezasXID(codigo);

		piezas_select.setNombre(piezas.getNombre());
		piezas_select.setSuministra(piezas.getSuministra());
		
		piezas_update = piezasServideImpl.updatePiezas(piezas_select);

		System.out.println("El piezas actualizado es: " + piezas_update);

		return piezas_update;
	}

	@DeleteMapping("/piezas/{codigo}")
	public void deletePiezas(@PathVariable(name = "codigo") int codigo) {
		piezasServideImpl.deletePiezas(codigo);
	}

}

