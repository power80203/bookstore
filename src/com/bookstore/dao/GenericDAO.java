package com.bookstore.dao;

import java.util.List;

public interface GenericDAO<T> {
	
	// 實際定義DAO應該要有哪一些功能
	// 
	
	public T create(T t);
	
	public T update(T t);

	
	public T get(Object id);

	
	public void delete(Object id);

	public List<T> listAll();
	
	public long count();

	

	
	
	

}
