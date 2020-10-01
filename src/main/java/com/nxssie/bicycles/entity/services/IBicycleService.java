package com.nxssie.bicycles.entity.services;

import java.util.List;

import com.nxssie.bicycles.entity.models.Bicycle;

public interface IBicycleService {
	public List<Bicycle> getAll();

	public void addBicycle(Bicycle bicycle);

	public void deleteBicycle(int id);

	public void updateBicyle(int id, Bicycle bicycle);

	public Bicycle findById(int id, Bicycle bicycle);


}
