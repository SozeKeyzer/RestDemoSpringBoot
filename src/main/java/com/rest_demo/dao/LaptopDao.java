package com.rest_demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest_demo.entities.Laptop;

public interface LaptopDao extends JpaRepository<Laptop, Integer>{
	
}
