package com.bookstore.dao;

import static org.junit.Assert.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Test;

import com.bookstore.entity.Users;

public class UserDAOTest {

	@Test
	public void testCreateUsers() {
		
		//fail("Not yet implemented");
		
		Users user1 = new Users();
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("BookStoreWebsite");
		EntityManager e = entityManagerFactory.createEntityManager();
		
		user1.setEmail("123");
		user1.setFullName("Daivdd Jordan");
		user1.setPassword("123213123");
		
		UserDAO userDAO = new UserDAO(e);
		
		userDAO.create(user1);
		
		entityManagerFactory.close();
				
	}
	
	

}
