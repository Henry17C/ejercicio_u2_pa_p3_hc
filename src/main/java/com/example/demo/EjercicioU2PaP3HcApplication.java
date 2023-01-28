package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.ejercicio2.modelo.Automovil;
import com.example.demo.ejercicio2.service.IAutomovilService;

@SpringBootApplication
public class EjercicioU2PaP3HcApplication implements CommandLineRunner {

	
	@Autowired 
	IAutomovilService automovilService;
	public static void main(String[] args) {
		SpringApplication.run(EjercicioU2PaP3HcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		//1 INSSERTAR AUTO
	Automovil automovil = new Automovil();
		
		automovil.setPalca("ASD12");
		automovil.setValorDia( new BigDecimal(3000));
		
		automovilService.insertar(automovil);
		
	
		 
		
	}

}
