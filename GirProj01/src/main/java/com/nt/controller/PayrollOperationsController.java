package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.bean.Employee;
import com.nt.service.ServiceInterface;

@Controller("payroll")
public class PayrollOperationsController {

	@Autowired
	private ServiceInterface service;

	public List<Employee> ShowAllEmployeesByDesg(String desg1, String desg2, String desg3) throws Exception {

//	use service
		List<Employee> list = service.fetchAllEmployeesByDesg(desg1, desg2, desg3);

		// <<< -- wirte b logic --- >>

		return list;
   
	}// method
	
//	inserting data
	
	public String processEmployee(Employee emp2) throws Exception{
		String resultMsg=service.registerEmployee(emp2);
		return resultMsg;
	}

} // class
