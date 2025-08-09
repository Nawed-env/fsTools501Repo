package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.DAO.IEmployeeDAO;
import com.nt.bean.Employee;

@Service("empService")
public class EmployeeServiceImpl implements ServiceInterface {

	@Autowired // dao impl class is injected
	private IEmployeeDAO dao;

	@Override
	public List<Employee> fetchAllEmployeesByDesg(String desg1, String desg2, String desg3) throws Exception {

		List<Employee> list = dao.getEmployeeByDesgs(desg1, desg2, desg3);

		//b login
		list.forEach(emp -> {
			emp.setGrossSalary(emp.getSalary() + emp.getSalary() * 0.2f);
			emp.setNetSalary(emp.getGrossSalary()-emp.getGrossSalary()*0.1f);
			
			
		});

		return list;
	}

//	inserting data
	@Override
	public String registerEmployee(Employee emp2) throws Exception {
		int result = dao.insertEmployee(emp2);
		return result == 0 ? "Employee not registered" : "Employee is registered";
	}

}
