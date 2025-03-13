package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class MyServiceImp implements MyService{

	@Autowired
	private MyRepository rep;
	@Override
	public MyEntity insert(MyEntity entity) {
		 MyEntity ins=rep.save(entity);
		return ins;
	}

	@Override
	public List<MyEntity> getAll() {
         List<MyEntity> all=rep.findAll();
		return all;
	}

	@Override
	public void delete(int id) {
         rep.deleteById(id);	
	}
	@Override
	public MyEntity update(int id, MyEntity entity) {
       MyEntity upd=rep.findById(id).get();
       upd.setName(entity.getName());
		return rep.save(upd);

	
	}

}
