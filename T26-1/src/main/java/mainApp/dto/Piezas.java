package mainApp.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "piezas") // en caso que la tabla sea diferente
public class Piezas {

	// Atributos de entidad piezas
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // busca ultimo valor e incrementa desde id final de db
	private int codigo;
	@Column(name = "nombre") // no hace falta si se llama igual
	private String nombre;
	
	@OneToMany
    @JoinColumn(name="codigo")
    private List<Suministra> suministra;
	
	//Constructores
	public Piezas() {
	}
	
	/**
	 * 	
	 * @param codigo
	 * @param nombre
	 * @param suministra
	 */
		public Piezas(int codigo, String nombre, List<Suministra> suministra) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.suministra = suministra;
	}

	// getter y setter
	/**
	 * 
	 * @return
	 */
	public int getCodigo() {
		return codigo;
	}
	
	/**
	 * 
	 * @param codigo
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	/**
	 * 
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * 
	 * @return
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Suministra")
	public List<Suministra> getSuministra() {
		return suministra;
	}
	
	/**
	 * 
	 * @param suministra
	 */
	public void setSuministra(List<Suministra> suministra) {
		this.suministra = suministra;
	}

	@Override
	public String toString() {
		return "Piezas [codigo=" + codigo + ", nombre=" + nombre + "]";
	}
	
}


