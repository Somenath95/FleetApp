package io.example.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleHireController {

	@GetMapping("/vehicle-hires")
	public String getVehicleHires() {
		return "vehicleHire";
	}
}
