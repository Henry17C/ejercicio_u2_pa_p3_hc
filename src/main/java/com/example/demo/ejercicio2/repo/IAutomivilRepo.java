package com.example.demo.ejercicio2.repo;

import com.example.demo.ejercicio2.modelo.Automovil;
import com.example.demo.ejercicio2.modelo.Renta;

public interface IAutomivilRepo {
	
	public void insertar (Automovil automovil);
	
	
	public Automovil buscar(String id);

}
