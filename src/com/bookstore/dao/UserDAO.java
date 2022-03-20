package com.bookstore.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.junit.Test;

import com.bookstore.entity.Users;

public class UserDAO extends JpaDAO<Users> implements GenericDAO<Users> {

	public UserDAO(EntityManager entityManager) {
		super(entityManager);
		// TODO Auto-generated constructor stub
	}
	
	
	//這個方法定義在 father not interface 所以unimplement 方法看不到
	//沒有動態產生
	public Users create(Users user) {
		return super.create(user);
	}
	

	@Override
	public Users update(Users t) {
		// TODO Auto-generated method stub
		return super.update(t);
//		return null;
	}

	@Override
	public Users get(Object UserId) {
		// TODO Auto-generated method stub
		
		return super.find(Users.class, UserId);
	}

	@Override
	public void delete(Object id) {
		// TODO Auto-generated method stub
		
	}
	

	@Override
	public List<Users> listAll() {
		
		return super.findWithNamedQuery("Users.findAll");
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}
	

	
	
	

}
