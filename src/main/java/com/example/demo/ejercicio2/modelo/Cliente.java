package com.example.demo.ejercicio2.modelo;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {
	
	
	

	@Id
	@Column(name = "cedula")
	private String cedula;
	
	
	@Column(name = "cedula")
	private String nombre;
	
	

	@OneToMany()
	private List<Renta> listaRenta;



	public String getCedula() {
		return cedula;
	}



	public void setCedula(String cedula) {
		this.cedula = cedula;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public List<Renta> getListaRenta() {
		return listaRenta;
	}



	public void setListaRenta(List<Renta> listaRenta) {
		this.listaRenta = listaRenta;
	}
	
	

}
