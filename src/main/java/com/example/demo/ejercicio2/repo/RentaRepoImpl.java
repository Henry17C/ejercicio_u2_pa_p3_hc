package com.example.demo.ejercicio2.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.ejercicio2.modelo.Renta;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class RentaRepoImpl implements IRentaRepo {
	
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Renta renta) {
		// TODO Auto-generated method stub
		entityManager.persist(renta);
	}

	@Override
	public void actuatizar(Renta renta) {
		// TODO Auto-generated method stub
		
		entityManager.merge(renta);
		
	}

	@Override
	public Renta buscar(Integer id) {
		// TODO Auto-generated method stub
		return entityManager.find(Renta.class, id);
	}
	
	

}
