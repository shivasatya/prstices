package com.shiva.plant.product.management.order.plant.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/call")
	public String name() {
		return "Shiva";
	}
}
