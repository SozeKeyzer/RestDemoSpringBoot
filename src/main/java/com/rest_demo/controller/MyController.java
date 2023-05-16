package com.rest_demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PutExchange;

import com.rest_demo.entities.Laptop;
import com.rest_demo.services.LaptopService;

@RestController
public class MyController {
	
	@Autowired
	private LaptopService laptopService;
	
	@GetMapping("/home")
	public String home() {
		return "this is home"; 
	}
	
	@GetMapping("/laptops")
	public List<Laptop> getLaptops(){
		return laptopService.getLaptops();
	}
	
	@GetMapping("/laptops/{laptopId}")
	public Laptop getLaptop(@PathVariable String laptopId) {
		return laptopService.getLaptop(Integer.parseInt(laptopId));
	}
	
	@PostMapping("/laptops/addlaptop")
	public Laptop addLaptop(@RequestBody Laptop laptop) {
		return laptopService.addLaptop(laptop);
	}
	
	@PutMapping("/laptops/updatelaptop")
	public Laptop updateLaptop(@RequestBody Laptop laptop) {
		return laptopService.updateLaptop(laptop);
	}
	
	@DeleteMapping("/laptops/deletelaptop/{laptopId}")
	public List<Laptop> deleteLaptop(@PathVariable String laptopId) {
		return laptopService.deleteLaptop(Integer.parseInt(laptopId));
	}
	
}
