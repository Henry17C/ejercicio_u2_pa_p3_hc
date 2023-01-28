package com.example.demo.ejercicio2.service;

import com.example.demo.ejercicio2.modelo.Renta;

public interface IRentaService {
	
	public void RealizarRenta (String placa, String cedula, Integer numeroDias, String numeroTargeta );
	public void actuatizar (Renta renta);
	public Renta buscar(Integer id);

}
