package com.nt.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.bean.Employee;

@Repository("empDAO_1")   
public class EmployeeDAOimplMySQL implements IEmployeeDAO2 {
	@Autowired   // it create automatically hikari Bean and it automatically takes data from your properties file and inject here the bean
	private DataSource ds;  //create instance of HikariCP..
	int result=0;
	private static final String SET_EMPS_QUERY = "INSERT INTO EMP(EMPNO,ENAME,JOB,SAL)VALUES(empno_seq1.NEXTVAL,?,?,?)";// only
																														// 4
																														// col
  
	@Override
	public int insertEmployeeMySQL(Employee emp3) throws Exception {
	
		try(Connection con=ds.getConnection();
		PreparedStatement stm=con.prepareStatement(SET_EMPS_QUERY);	
		){
          stm.setString(1,emp3.getEname());
          stm.setString(2,emp3.getJob());
          stm.setDouble(3,emp3.getSalary());
          
           result=stm.executeUpdate();
			
		} //try
		catch (SQLException ex) {
			throw ex;
		}
		catch (Exception e) {
			throw e;
		}
		return result;
		
	}

	

} // class
