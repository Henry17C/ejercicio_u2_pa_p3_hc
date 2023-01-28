package com.example.demo.ejercicio2.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import javax.print.attribute.standard.DateTimeAtCompleted;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;


@Entity
@Table(name = "renta")
public class Renta {

	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "renta_sec")//generarlo como secuencia
	@SequenceGenerator(name = "renta_sec", sequenceName = "renta_sec", allocationSize = 1)
	@Column(name= "renta_id")
	private Integer id;
	
	
	@Column(name= "renta_fecha")
	private LocalDateTime fecha;
	
	@Column(name= "renta_numeroDias")
	private Integer numeroDias;
	
	@Column(name= "renta_valorRenta")
	private BigDecimal valorRenta;
	
	@ManyToOne()
	@JoinColumn(name = "renta_cliente")
	private Cliente cliente;
	
	
	@ManyToOne()
	@JoinColumn(name = "renta_automovil")
	private Automovil automovil;
	
	@OneToOne()
	@JoinColumn(name = "renta_automovil")
	private Pago pago;
	
	


	
	
	
	
	
}
