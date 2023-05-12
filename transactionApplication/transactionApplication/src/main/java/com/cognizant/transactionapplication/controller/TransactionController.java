package com.cognizant.transactionapplication.controller;

import com.cognizant.transactionapplication.model.Transaction;
import com.cognizant.transactionapplication.model.response.transactionserviceresponsemodel;
import com.cognizant.transactionapplication.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class TransactionController {
	@Autowired
	TransactionRepository transactionRepository;
	@GetMapping("/test")
	private String testMethod() {
		return "working";
	}
	@PostMapping("/transaction")
	private ResponseEntity<transactionserviceresponsemodel> createTransaction(@RequestBody Transaction transaction) {
		   transactionRepository.save(transaction);
		return ResponseEntity.status(HttpStatus.CREATED).body(new transactionserviceresponsemodel("created Transaction Entry"));
	}




}
