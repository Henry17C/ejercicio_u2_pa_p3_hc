package com.example.demo.ejercicio2.modelo;

import java.math.BigDecimal;
import java.util.List;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "automovil")
public class Automovil {
	
	@Id
	@Column(name = "auto_placa")
	private String palca;
	
	@Column(name = "auto_valorDia")
	private BigDecimal valorDia;
	
	@OneToMany()
	private List<Renta> listaRenta;

	public String getPalca() {
		return palca;
	}

	public void setPalca(String palca) {
		this.palca = palca;
	}

	public BigDecimal getValorDia() {
		return valorDia;
	}

	public void setValorDia(BigDecimal valorDia) {
		this.valorDia = valorDia;
	}

	public List<Renta> getListaRenta() {
		return listaRenta;
	}

	public void setListaRenta(List<Renta> listaRenta) {
		this.listaRenta = listaRenta;
	}
	
	
	

}
