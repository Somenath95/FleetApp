package io.example.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleTypeController {

	@GetMapping("/vehicle-types")
	public String getVehicleTypes() {
		return "vehicleType";
	}
}
