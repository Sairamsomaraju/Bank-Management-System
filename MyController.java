package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class MyController {
   @Autowired
	private MyServiceImp con;
	@PostMapping("/emp")
   public MyEntity saveentity(@RequestBody MyEntity entity)
   {
	   return con.insert(entity); 
   }
	@GetMapping("/emp")
   public List<MyEntity> getall()
   {
	return con.getAll();
	   
   }
	@DeleteMapping("/emp/{id}")
	public void deleteone(@PathVariable int id)
	{
		con.delete(id);
	}
	@PutMapping("/emp/{id}")
	public MyEntity updaterecord( @PathVariable int id , @RequestBody MyEntity entity  ) {
		return con.update(id, entity);
	}
}
