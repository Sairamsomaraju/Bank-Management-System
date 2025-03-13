package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class MyEntity {
 @Id
 @GeneratedValue(strategy=GenerationType.IDENTITY)
	 private int id;
 
	 private String name;
	 private String address;
	 private Double price;
	 
	 public MyEntity()
	 {
		 
	 }

	public MyEntity(int id, String name, String address, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	 
}
