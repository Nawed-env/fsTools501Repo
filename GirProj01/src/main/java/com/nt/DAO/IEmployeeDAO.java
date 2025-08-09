package com.nt.DAO;

import java.util.List;

import com.nt.bean.Employee;

public interface IEmployeeDAO {
	
	public List<Employee> getEmployeeByDesgs(String desg1,String desg2,String desg3)throws Exception;

	public int insertEmployee(Employee emp2) throws Exception;
	
}
