package com.nxssie.bicycles.entity.dao;

import org.springframework.data.repository.CrudRepository;

import com.nxssie.bicycles.entity.models.Bicycle;

public interface IBicycleDao extends CrudRepository<Bicycle, Integer> {
	
}
