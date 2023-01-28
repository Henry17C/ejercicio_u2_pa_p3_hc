package com.example.demo.ejercicio2.repo;


import com.example.demo.ejercicio2.modelo.Renta;



public interface IRentaRepo {
	
	
	
	public void insertar (Renta renta);
	public void actuatizar (Renta renta);
	
	public Renta buscar(Integer  id);
	

}
