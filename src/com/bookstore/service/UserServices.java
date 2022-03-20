package com.bookstore.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.bookstore.dao.UserDAO;
import com.bookstore.entity.Users;

public class UserServices {
	
	private UserDAO userDAO;
	public EntityManager entityManager;
	public EntityManagerFactory entityManagerFactory;

	public UserServices() {
		
		entityManagerFactory = Persistence.createEntityManagerFactory("BookStoreWebsite");
		entityManager = entityManagerFactory.createEntityManager();
		userDAO = new UserDAO(entityManager);
		
	}
	
	
	public void listUser() {
		List<Users> users = userDAO.listAll();
		
	}

}
