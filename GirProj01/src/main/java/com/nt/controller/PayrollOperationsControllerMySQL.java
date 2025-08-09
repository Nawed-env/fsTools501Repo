package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.bean.Employee;
import com.nt.service.serviceInteface2;

@Controller("payRollMySQL")
public class PayrollOperationsControllerMySQL {

	@Autowired
	private serviceInteface2 service;
	
     public String settingDatatoSQL(Employee emp3) throws Exception{
    	 
    	 String msg=service.registerDataToMySQL(emp3);
    	 return msg;
     }
	

} // class
