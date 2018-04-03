package com.wineshop.dao;

import java.util.List;

public interface GenericDAO<T> {

	public T findById(int id);

	public List<T> findAll();

	public T save(T entity);

	public T update(T entity);

	public void delete(int id);
}
