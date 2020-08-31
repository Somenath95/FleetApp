package io.example.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InvoiceStatusController {

	@GetMapping("/invoice-status")
	public String getInvoiceStatuses() {
		return "invoiceStatus";
	}
}
