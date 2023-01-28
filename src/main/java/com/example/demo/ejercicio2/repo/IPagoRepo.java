package com.example.demo.ejercicio2.repo;

import com.example.demo.ejercicio2.modelo.Automovil;
import com.example.demo.ejercicio2.modelo.Pago;
import com.example.demo.ejercicio2.modelo.Renta;

public interface IPagoRepo {
	
	public void insertar (Pago pago);
	
	
	public Pago buscar(Integer id);

}
