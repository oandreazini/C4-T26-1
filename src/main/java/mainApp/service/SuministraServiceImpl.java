package mainApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import mainApp.dao.ISuministraDAO;
import mainApp.dto.Suministra;


@Service
public class SuministraServiceImpl implements ISuministraService{
	
	// Utilizamos los metodos de la interface IPiezasDAO, es como si instaciaramos.
	@Autowired
	ISuministraDAO iSuministraDAO;
	
	@Override
	public List<Suministra> listSuministra() {
		
		return iSuministraDAO.findAll();
	}

	@Override
	public Suministra saveSuministra(Suministra piezas) {
		
		return iSuministraDAO.save(piezas);
	}

	@Override
	public Suministra suministraXID(Integer id) {
		
		return iSuministraDAO.findById(id).get();
	}

	@Override
	public Suministra updateSuministra(Suministra piezas) {
		
		return iSuministraDAO.save(piezas);
	}

	@Override
	public void deleteSuministra(Integer id) {
		iSuministraDAO.deleteById(id);
		
	}

}
