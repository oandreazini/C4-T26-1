package mainApp.service;

import java.util.List;

import mainApp.dto.Suministra;

public interface ISuministraService {

	//Metodos del CRUD
	public List<Suministra> listSuministra(); //Listar All 

	public Suministra saveSuministra(Suministra piezas);	//Guarda un suministra CREATE

	public Suministra suministraXID(Integer id); //Leer datos de un suministra READ

	public Suministra updateSuministra(Suministra piezas); //Actualiza datos del suministra UPDATE

	public void deleteSuministra(Integer id);// Elimina el suministra DELETE

}
