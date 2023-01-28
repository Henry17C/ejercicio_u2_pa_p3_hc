package com.example.demo.ejercicio2.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.ejercicio2.modelo.Automovil;
import com.example.demo.ejercicio2.modelo.Pago;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class PagoRepoImpl implements IPagoRepo {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Pago pago) {
		// TODO Auto-generated method stub
		entityManager.persist(pago);
	}

	@Override
	public Pago buscar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
