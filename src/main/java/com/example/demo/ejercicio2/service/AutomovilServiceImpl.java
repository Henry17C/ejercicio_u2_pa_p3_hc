package com.example.demo.ejercicio2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ejercicio2.modelo.Automovil;
import com.example.demo.ejercicio2.repo.IAutomivilRepo;

@Service
public class AutomovilServiceImpl implements IAutomovilService {
	
	@Autowired
	IAutomivilRepo automivilRepo;

	@Override
	public void insertar(Automovil automovil) {
		// TODO Auto-generated method stub
		
		automivilRepo.insertar(automovil);
		
	}

	@Override
	public Automovil buscar(String id) {
		// TODO Auto-generated method stub
		Automovil automovil= automivilRepo.buscar(id);
		
		return automovil;
	}
	
	

}
