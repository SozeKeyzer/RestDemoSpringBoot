package com.rest_demo.services;

import java.util.List;

import com.rest_demo.entities.Laptop;

public interface LaptopService {
 public List<Laptop> getLaptops();
 public Laptop getLaptop(int serial);
 public Laptop addLaptop(Laptop laptop);
 public Laptop updateLaptop(Laptop laptop);
 public List<Laptop> deleteLaptop(int serial);
}
