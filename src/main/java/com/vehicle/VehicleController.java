package com.vehicle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="/Vehicle")
public class VehicleController {
	@Autowired
	VehicleService vs;
	
	@PostMapping(value="/postVehicle")
	public String postThis(@RequestBody Vehicle v) {
		return vs.postThis(v);
	}
	@PostMapping(value="/Vehicles")
	public String postVeh(@RequestBody List<Vehicle> v) {
		return vs.postVeh(v);
	}
	@GetMapping(value="/getDetails")
	public List<Vehicle> getVehicles(){
		return vs.getVehicles();
	}
	@GetMapping(value="/getId/{a}")
	public Vehicle getId(@PathVariable int a) {
		return vs.getId(a);
	}
	@PutMapping(value="/putDetails")
	public String putVehicle(@RequestBody Vehicle v) {
		return vs.putVehicle(v);
	}
	@PatchMapping(value="/patchDetails/{a}")
	public String patchVehicle(@PathVariable int a,@RequestBody Vehicle v) {
		return vs.patchVehicle(a,v);
	}
	@DeleteMapping(value="/deleteDetails/{a}")
	public String deleteId(@PathVariable int a) {
		return vs.deleteId(a);
	}
	}
