package mainApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mainApp.dao.IPiezasDAO;
import mainApp.dto.Piezas;

@Service
public class PiezasServiceImpl implements IPiezasService {

	// Utilizamos los metodos de la interface IPiezasDAO, es como si instaciaramos.
	@Autowired
	IPiezasDAO iPiezasDAO;
	
	@Override
	public List<Piezas> listPiezas() {
		
		return iPiezasDAO.findAll();
	}

	@Override
	public Piezas savePiezas(Piezas piezas) {
		
		return iPiezasDAO.save(piezas);
	}

	@Override
	public Piezas piezasXID(Integer id) {
		
		return iPiezasDAO.findById(id).get();
	}

	@Override
	public Piezas updatePiezas(Piezas piezas) {
		
		return iPiezasDAO.save(piezas);
	}

	@Override
	public void deletePiezas(Integer id) {
		iPiezasDAO.deleteById(id);

	}

}
