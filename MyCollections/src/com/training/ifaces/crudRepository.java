package com.training.ifaces;

import java.util.List;

public interface crudRepository<T> {

	public boolean save(T inv);
	public List<T> findAll();
}
