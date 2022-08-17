package mainApp.service;

import java.util.List;

import mainApp.dto.Piezas;


public interface IPiezasService {

	//Metodos del CRUD
	public List<Piezas> listPiezas(); //Listar All 

	public Piezas savePiezas(Piezas piezas);	//Guarda un piezas CREATE

	public Piezas piezasXID(Integer id); //Leer datos de un piezas READ

	public Piezas updatePiezas(Piezas piezas); //Actualiza datos del piezas UPDATE

	public void deletePiezas(Integer id);// Elimina el piezas DELETE

}
