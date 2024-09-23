package com.vehicle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Service

public class VehicleService {
	@Autowired
	VehicleRepository_DAO vd;
	
	public String postThis(Vehicle v) {
		return vd.postThis(v);
	}
	public String postVeh(List<Vehicle> v) {
		return vd.postVeh(v);
	}
	public List<Vehicle> getVehicles(){
		return vd.getVehicles();
	}
	public Vehicle getId(@PathVariable int a) {
		return vd.getId(a);
	}
	public String putVehicle(Vehicle v) {
		return vd.putVehicle(v);
	}
	public String patchVehicle(@PathVariable int a,@RequestBody Vehicle v) {
		return vd.patchVehicle(a,v);
	}
	public String deleteId(@PathVariable int a) {
		return vd.deleteId(a);
	}
}
