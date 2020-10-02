package com.nxssie.bicycles.entity.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nxssie.bicycles.entity.dao.IBicycleDao;
import com.nxssie.bicycles.entity.models.Bicycle;

@Service
public class BicycleServiceImpl implements IBicycleService {

	@Autowired
	IBicycleDao bicycleDao;
	
	@Override
	public List<Bicycle> getAll() {
		// TODO Auto-generated method stub
		return (List<Bicycle>) bicycleDao.findAll();
	}
	
	@Override
	public Bicycle findById(int id) {
		Optional<Bicycle> b = bicycleDao.findById(id);
		
		if (b.isPresent()) {
			return b.get();
		}
		
		return null;
	}

	@Override
	public void addBicycle(Bicycle bicycle) {
		bicycleDao.save(bicycle);
	}
	
	@Override
	public void deleteBicycle (int id) {
		bicycleDao.deleteById(id);
	}

	@Override
	public void updateBicyle(int id, Bicycle bicycle) {
		Optional <Bicycle> b = bicycleDao.findById(id);
		
		if (b.isPresent()) {
			bicycle.setId(id);
			bicycleDao.save(bicycle);
		}
		
	}
	
}
