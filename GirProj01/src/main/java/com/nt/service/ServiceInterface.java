package com.nt.service;

import java.util.List;

import com.nt.bean.Employee;

public interface ServiceInterface {
	
	public List<Employee>fetchAllEmployeesByDesg(String desg1,String desg2,String desg3)throws Exception;

	public String registerEmployee(Employee emp2) throws Exception;
	

	
}
