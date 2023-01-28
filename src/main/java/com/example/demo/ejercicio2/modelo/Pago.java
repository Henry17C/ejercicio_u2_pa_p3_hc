package com.example.demo.ejercicio2.modelo;

import java.math.BigDecimal;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "pago")
public class Pago {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pago_sec")//generarlo como secuencia
	@SequenceGenerator(name = "pago_sec", sequenceName = "pago_sec", allocationSize = 1)
	@Column(name= "renta_id")
	private Integer id;
	
	
	@Column(name= "renta_numeroTagerta")
	private String numeroTagerta;
	
	@Column(name= "renta_valorPago")
	private BigDecimal valorPago;
	
	@OneToOne(mappedBy = "pago", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Renta renta;
	
	
	
	
	

}
