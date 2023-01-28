package com.example.demo.ejercicio2.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.ejercicio2.modelo.Automovil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class AutomovilRepoImpl implements IAutomivilRepo {

	@PersistenceContext
	private EntityManager entityManager;

	
	@Override
	public void insertar(Automovil automovil) {
		entityManager.persist(automovil);
	
	}


	@Override
	public Automovil buscar(String id) {
		// TODO Auto-generated method stub
		return entityManager.find(Automovil.class, id);
	}

}
