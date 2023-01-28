package com.example.demo.ejercicio2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ejercicio2.modelo.Automovil;
import com.example.demo.ejercicio2.modelo.Renta;
import com.example.demo.ejercicio2.repo.IAutomivilRepo;
import com.example.demo.ejercicio2.repo.IRentaRepo;

@Service
public class RentaServiceImpl implements IRentaService {

	@Autowired
	IAutomivilRepo automivilRepo;
	@Autowired
	private IRentaRepo iRentaRepo;
	
	

	@Override
	public void actuatizar(Renta renta) {
		// TODO Auto-generated method stub
		iRentaRepo.actuatizar(renta);
	}

	@Override
	public Renta buscar(Integer id) {
		// TODO Auto-generated method stub
		return iRentaRepo.buscar(id);
	}

	@Override
	public void RealizarRenta(String placa, String cedula, Integer numeroDias, String numeroTargeta) {
		
		Automovil automovil = new Automovil();
		automivilRepo.buscar(placa);
		
	
		
		
		
	}

}
