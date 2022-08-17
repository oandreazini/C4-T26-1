package mainApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mainApp.dao.IProveedoresDAO;
import mainApp.dto.Proveedores;

@Service
public class ProveedoresServiceImpl implements IProveedoresService {
	
	// Utilizamos los metodos de la interface IPiezasDAO, es como si instaciaramos.
	@Autowired
	IProveedoresDAO iProveedoresDAO;
	
	@Override
	public List<Proveedores> listProveedores() {

		return iProveedoresDAO.findAll();
	}

	@Override
	public Proveedores saveProveedores(Proveedores proveedores) {
		
		return iProveedoresDAO.save(proveedores);
	}

	@Override
	public Proveedores proveedoresXID(Integer codigo) {
	
		return iProveedoresDAO.findById(codigo).get();
	}

	@Override
	public Proveedores updateProveedores(Proveedores proveedores) {

		return iProveedoresDAO.save(proveedores);
	}

	@Override
	public void deleteProveedores(Integer codigo) {
		iProveedoresDAO.deleteById(codigo);
		
	}

}
