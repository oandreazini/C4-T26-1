package mainApp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "suministra") // en caso que la tabla sea diferente
public class Suministra {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // busca ultimo valor e incrementa desde id final de db
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "codigo_pieza")
	private Piezas piezas;
	
	@ManyToOne
	@JoinColumn(name = "id_proveedor")
	private Proveedores proveedores;
	
	@Column(name = "precio") 
	private int precio;
	
	//Constructores

	public Suministra() {
	
	}
	
	/**
	 * 
	 * @param id
	 * @param piezas
	 * @param proveedores
	 * @param precio
	 */
	public Suministra(int id, Piezas piezas, Proveedores proveedores, int precio) {
		this.id = id;
		this.piezas = piezas;
		this.proveedores = proveedores;
		this.precio = precio;
	}
	
	//Getters & Setters
	
	/**
	 * 
	 * @return
	 */
	public int getId() {
		return id;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * 
	 * @return
	 */
	public Piezas getPiezas() {
		return piezas;
	}

	/**
	 * 
	 * @param piezas
	 */
	public void setPiezas(Piezas piezas) {
		this.piezas = piezas;
	}

	/**
	 * 
	 * @return
	 */
	public Proveedores getProveedores() {
		return proveedores;
	}

	/**
	 * 
	 * @param proveedores
	 */
	public void setProveedores(Proveedores proveedores) {
		this.proveedores = proveedores;
	}

	/**
	 * 
	 * @return
	 */
	public int getPrecio() {
		return precio;
	}

	/**
	 * 
	 * @param precio
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Suministra [id=" + id + ", piezas=" + piezas + ", proveedores=" + proveedores + ", precio=" + precio
				+ "]";
	}
}
