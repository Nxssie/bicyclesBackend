package com.nxssie.bicycles.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nxssie.bicycles.entity.models.Bicycle;
import com.nxssie.bicycles.entity.services.IBicycleService;

@CrossOrigin(origins = "http://localhost:8100")
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
	
	@GetMapping("/api/bicycles/{id}")
	private Bicycle findById(@PathVariable(value = "id") int id, Bicycle bicycle){
		return bicycleService.findById(id, bicycle);
	}
		
	@PostMapping("/api/bicycles")
	private void addBicycle(Bicycle bicycle) {
		bicycleService.addBicycle(bicycle);
	}
	
	@DeleteMapping("/api/bicycles/{id}")
	private void deleteBicycle(@PathVariable(value = "id") int id) {
		bicycleService.deleteBicycle(id);
	}
	
	@PutMapping("/api/bicycles/{id}")
	private void updateBicycle(@PathVariable(value = "id") int id, Bicycle bicycle) {
		bicycleService.updateBicyle(id, bicycle);
	}
}
