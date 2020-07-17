package com.spectrum.assessment.springboot.rewards;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.spectrum.assessment.springboot.model.Customer;
import com.spectrum.assessment.springboot.model.Transactions;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class RewardsProgressController {

	@Autowired
	private RewardsProgressService rewardsProgressService;
	
	@GetMapping("/customers")
	public List<Customer> findCustomerAll() {
		return rewardsProgressService.getCustomerAll();
	}
	
	@GetMapping("/customers/{id}")
	public ResponseEntity<Customer> getCustomer(@PathVariable Integer id) {
		Customer customer = rewardsProgressService.getCustomerById(id);
		if (customer == null) return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
		return new ResponseEntity<Customer>(customer, HttpStatus.OK);
	}
	
}
