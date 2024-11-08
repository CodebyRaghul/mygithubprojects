package com.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.entity.Bank;
import com.bank.service.BankService;

@RestController
@RequestMapping(value="/Bank")
public class BankController {

	@Autowired
	BankService bs;
	
	@PostMapping(value="/PostAll")
	public String bankPostAll(@RequestBody List<Bank> b){
		return bs.bankPostAll(b);
	}
	@GetMapping(value="/GetBranch/{ifsc}")
	public String getBranch(@PathVariable String ifsc) {
		return bs.getBranch(ifsc);
	}
	
}
