package com.nxssie.bicycles.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nxssie.bicycles.entity.models.Bicycle;
import com.nxssie.bicycles.entity.services.IBicycleService;

@RestController
public class BicycleController {
	
	@Autowired
	IBicycleService bicycleService;
	// Here are the end-points

	@CrossOrigin(origins = "http://localhost:8100")
	@GetMapping("/api/bicycles")
	private List<Bicycle> getAll(){
		return bicycleService.getAll();
	}
}