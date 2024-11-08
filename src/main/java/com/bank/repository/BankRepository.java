package com.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bank.entity.Bank;


public interface BankRepository extends JpaRepository<Bank,Integer>{

//	@Query(value = "SELECT * FROM studentmarksheet.studentmarksheet_db", nativeQuery=true)
//	public List<StudentMarkSheet> getStudentMarkSheet();
	
	@Query(value="SELECT branch FROM bank_details.bank_db where ifsc_code= ?",nativeQuery=true)
	public String getBranch(String ifsc);
	
//	@Query(value="SELECT branch FROM bank_details.bank_db where ifsc_code= ?",nativeQuery=true)
	
}
