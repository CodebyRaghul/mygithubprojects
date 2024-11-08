package com.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.dao.BankDao;
import com.bank.entity.Bank;

@Service
public class BankService {

	@Autowired
	BankDao bd;
	
	public String bankPostAll(List<Bank> b){
		return bd.bankPostAll(b);
	}
	public String getBranch(String ifsc) {
		return bd.getBranch(ifsc);
	}
}
