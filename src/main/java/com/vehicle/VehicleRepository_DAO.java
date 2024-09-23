package com.vehicle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Repository

public class VehicleRepository_DAO {
	@Autowired
	VehicleRepository vr;
	public String postThis(Vehicle v) {
		vr.save(v);
		return "Posted Success";
	}
	public String postVeh(List<Vehicle> v) {
		vr.saveAll(v);
		return "Posted";
	}
	public List<Vehicle> getVehicles(){
		return vr.findAll();
	}
	public Vehicle getId(@PathVariable int a) {
		return vr.findById(a).get();
	}
	public String putVehicle(@RequestBody Vehicle v) {
		vr.save(v);
		return "Success";
	}
	public String patchVehicle(@PathVariable int a,@RequestBody Vehicle v) {
		Vehicle vh=vr.findById(a).get();
		vh.setBrand(v.getBrand());
		vh.setPrice(v.getPrice());
		vr.save(vh);
		return "Done";
	}
	public String deleteId(@PathVariable int a) {
		vr.deleteById(a);
		return "Deleted";
	}
}
