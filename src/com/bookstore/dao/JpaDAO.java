package com.bookstore.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public class JpaDAO<E> {
	// 讓DAO有獲取DB的能力
	
	protected EntityManager entityManager;

	public JpaDAO(EntityManager entityManager) {
		// TODO Auto-generated constructor stub
		
		super();
		this.entityManager = entityManager;

		
	}
	
	public E create(E entity) {
		
		entityManager.getTransaction().begin();
		entityManager.persist(entity);
		entityManager.flush();
		entityManager.refresh(entity);
		
		entityManager.getTransaction().commit();
		
				
		return entity;
		
	}
	
	public E update(E entity) {
		
		entityManager.getTransaction().begin();

		entity = entityManager.merge(entity);
		
		entityManager.getTransaction().commit();
		
				
		return entity;
		
	}
	
	public E find(Class<E> type, Object id) {
		
		entityManager.getTransaction().begin();
		
		E entity = entityManager.find(type, id);
		
		entityManager.refresh(entity);
		
//		entityManager.getTransaction().commit();
		
		return entity;
		
	}
	
	public void delete(Class<E> type, Object id) {
		
		entityManager.getTransaction().begin();
		
		Object reference = entityManager.getReference(type, id);
				
		entityManager.remove(reference);
		
		
		entityManager.getTransaction().commit();
		
			
	}
	
	public List<E> findWithNamedQuery(String queryName){
		
		
		Query query = entityManager.createNamedQuery(queryName);
						
		
		return query.getResultList();
		
	}
	
	public Long countWithNamedQuery(String queryName){
		
		
		Query query = entityManager.createNamedQuery(queryName);
		
		return (Long) query.getSingleResult();
		
	}
	
		

	

}
