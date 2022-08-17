package mainApp.service;

import java.util.List;

import mainApp.dto.Proveedores;

public interface IProveedoresService {

	//Metodos del CRUD
	public List<Proveedores> listProveedores(); //Listar All 

	public Proveedores saveProveedores(Proveedores proveedores);	//Guarda un proveedores CREATE

	public Proveedores proveedoresXID(Integer codigo); //Leer datos de un proveedores READ

	public Proveedores updateProveedores(Proveedores proveedores); //Actualiza datos del proveedores UPDATE

	public void deleteProveedores(Integer codigo);// Elimina el proveedores DELETE
}
