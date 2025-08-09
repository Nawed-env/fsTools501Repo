package com.nt.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.bean.Employee;

@Repository("empDAO")
public class EmployeeDAOimpl implements IEmployeeDAO {

	private static final String GET_EMPS_QUERY = "SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP WHERE JOB IN(?,?,?) ORDER BY JOB";
	private static final String SET_EMPS_QUERY = "INSERT INTO EMP(EMPNO,ENAME,JOB,SAL)VALUES(empno_seq1.NEXTVAL,?,?,?)";// only
																														// 4
																														// col
																														// insrt
	@Autowired
	private DataSource ds;

	@Override
	public List<Employee> getEmployeeByDesgs(String desg1, String desg2, String desg3) throws SQLException {

		List<Employee> list = new ArrayList();

		try (Connection con = ds.getConnection();
		   PreparedStatement pstm = con.prepareStatement(GET_EMPS_QUERY);) {
			// set values to query param
			pstm.setString(1, desg1);
			pstm.setString(2, desg2);
			pstm.setString(3, desg3);

			// execute the SQL query
			try (ResultSet rs = pstm.executeQuery()) {
				// copy each record of the resultSet obj to Model class obj(bean class)

				while (rs.next()) {
					Employee emp = new Employee();

					emp.setEno(rs.getInt(1));
					emp.setEname(rs.getString(2));
					emp.setJob(rs.getString(3));
					emp.setSalary(rs.getDouble(4));
					emp.setDeptno(rs.getInt(5));

					list.add(emp);
				} // while close
			} // try2

		} // try1
		catch (SQLException se) {
			se.printStackTrace();
			throw se; // throwing the exception to catch by other classes

		}

		return list;

	} // method
		// ========================================>>>

	@Override
	public int insertEmployee(Employee emp2) throws Exception {
		int result = 0;
		try (Connection con = ds.getConnection();
				// create PreparedStatement obj having pre-compiled sql query
				PreparedStatement pstm1 = con.prepareStatement(SET_EMPS_QUERY);) {
			// set values to Query param
			pstm1.setString(1, emp2.getEname());
			pstm1.setString(2, emp2.getJob()); 
			pstm1.setDouble(3, emp2.getSalary());

			result = pstm1.executeUpdate();
		} catch (SQLException se) {
			throw se;
		} catch (Exception se) {
			throw se;
		}

		return result;

	}
} // class
