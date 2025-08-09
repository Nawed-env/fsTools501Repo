package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.DAO.EmployeeDAOimplMySQL;
import com.nt.bean.Employee;

@Service("service_MySQL")
public class EmployeeServiceImplMySQL implements serviceInteface2 {

	@Autowired
	private EmployeeDAOimplMySQL dao;
	@Override
	public String registerDataToMySQL(Employee emp3) throws Exception {
		
	   int result=dao.insertEmployeeMySQL(emp3);
	
		return result==1?"emp3 data registered":"emp3 Data not registered";
	}

}
