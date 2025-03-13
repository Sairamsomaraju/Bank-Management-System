package com.example.demo;

import java.util.List;

public interface MyService {

	public MyEntity insert(MyEntity entity);
	
	public List<MyEntity> getAll();
	
	public MyEntity update(int id, MyEntity entity);
	
	public void delete(int id);
}
