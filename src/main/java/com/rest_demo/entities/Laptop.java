package com.rest_demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Laptop {
 
  @Id
  private int serial;
  private String brand;
  private String ssd;
  
  public Laptop(int serial, String brand, String ssd) {
	super();
	this.serial = serial;
	this.brand = brand;
	this.ssd = ssd;
}

public Laptop() {
	super();
	// TODO Auto-generated constructor stub
}

public int getSerial() {
	return serial;
}

public void setSerial(int serial) {
	this.serial = serial;
}

public String getBrand() {
	return brand;
}

public void setBrand(String brand) {
	this.brand = brand;
}

public String getSsd() {
	return ssd;
}

public void setSsd(String ssd) {
	this.ssd = ssd;
}

@Override
public String toString() {
	return "Laptop [serial=" + serial + ", brand=" + brand + ", ssd=" + ssd + "]";
}
  


  

}
