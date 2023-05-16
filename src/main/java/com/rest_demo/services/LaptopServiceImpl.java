package com.rest_demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest_demo.dao.LaptopDao;
import com.rest_demo.entities.Laptop;

@Service
public class LaptopServiceImpl implements LaptopService {
	
	@Autowired
	private LaptopDao laptopDao;
	
//	List<Laptop> list;
	
	LaptopServiceImpl(){
//		list=new ArrayList<>();
//		list.add(new Laptop(3242,"Acer","samsung"));
//		list.add(new Laptop(2352,"Lenevo","sanddisk"));
//		list.add(new Laptop(6852,"Msi","sony"));
	}

	@Override
	public List<Laptop> getLaptops() {
		// TODO Auto-generated method stub
		return laptopDao.findAll();
	}

	@Override
	public Laptop getLaptop(int serial) {
		// TODO Auto-generated method stub
//		Laptop l=null;
//		for(Laptop laptop:list) {
//			
//			if(laptop.getSerial()==serial) {
//				l=laptop;
//				break;
//			}
//		}
		return laptopDao.getOne(serial);
	}

	@Override
	public Laptop addLaptop(Laptop laptop) {
//		list.add(laptop);
		laptopDao.save(laptop);
		return laptop;
	}

	@Override
	public Laptop updateLaptop(Laptop laptop) {
//		Laptop l=null;
//		for(Laptop lap:list) {
//			if(lap.getSerial()==laptop.getSerial()) {
//				l=lap;
//				break;
//			}
//		
//		}
//		l.setSsd(laptop.getSsd());
		
		laptopDao.save(laptop);
		return laptop;
	}

	@Override
	public List<Laptop> deleteLaptop(int serial) {

//		Laptop l=null;
//		
//		for(Laptop laptop:list) {
//			if(laptop.getSerial()==serial) {
//				l=laptop;
//				break;
//			}
//		}
//		list.remove(l);
		
		laptopDao.delete(laptopDao.getOne(serial));
		return laptopDao.findAll();
	}



}
