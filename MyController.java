package com.SpringLogi.SpringLogis.controller;
	
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.SpringLogi.SpringLogis.Service.ServiceInterface;
import com.SpringLogi.SpringLogis.entities.Load;

@RestController
public class MyController {
	
	@Autowired
	private ServiceInterface service1;
	
	@GetMapping("/home")
	public String home() {
		return"Logistiscs business will start now...";
	}
	
	//get the loading details
	@GetMapping("/load")
	public List<Load> getLoads() {
		return this.service1.getLoads() ;
		
	}
	
	//get single load details
	@GetMapping("/load/{loadId}")
	public Load getLoad(@PathVariable String loadId){
		
			return this.service1.getLoad(Long.parseLong(loadId));
	}
	//adding a load
	@PostMapping("/load")
	public Load addLoad(@RequestBody Load load) {
		return this.service1.addLoad(load);
		
	}
	//deleting a load
	@DeleteMapping("/load/{loadId}")
	public 	ResponseEntity<HttpStatus>deleteLoad(@PathVariable String loadId){
		try {
			this.service1.deleteLoad(Long.parseLong(loadId));
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e){
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	//updating load
	@PutMapping("/load/{loadId}")
	public Load updateLoad(@PathVariable Load load) {
		return this.service1.updateLoad(load);
	}
 
}
