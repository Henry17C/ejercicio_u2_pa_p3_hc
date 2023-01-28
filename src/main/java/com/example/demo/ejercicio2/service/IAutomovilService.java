package com.example.demo.ejercicio2.service;

import com.example.demo.ejercicio2.modelo.Automovil;

public interface IAutomovilService {

	

	public void insertar (Automovil automovil);
	
	public Automovil buscar(String id);
}
