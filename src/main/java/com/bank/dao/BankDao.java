package com.bank.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bank.entity.Bank;
import com.bank.repository.BankRepository;

@Repository
public class BankDao {

	@Autowired
	BankRepository br;
	
	public String bankPostAll(List<Bank> b){
		 br.saveAll(b);
		 return "List Posted Successfully";
	}
	
	public String getBranch(String ifsc) {
		return br.getBranch(ifsc);
	}
}
