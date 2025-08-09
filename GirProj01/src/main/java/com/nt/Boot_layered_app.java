package com.nt;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.bean.Employee;
import com.nt.controller.PayrollOperationsController;
import com.nt.controller.PayrollOperationsControllerMySQL;

@SpringBootApplication
public class Boot_layered_app {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// get IOC container
		ApplicationContext ctx = SpringApplication.run(Boot_layered_app.class, args);
		PayrollOperationsController controller = ctx.getBean("payroll", PayrollOperationsController.class);

		/// set data------------>
		System.out.println("Enter the  Name :");
		String data1 = sc.next();
		System.out.println("Enter the  job:");
		String data2 = sc.next();
		System.out.println("Enter the  salar:");
		Double data3 = sc.nextDouble();
		Employee emp = new Employee();
		emp.setEname(data1);
		emp.setJob(data2);
		emp.setSalary(data3);
		try {
			String msg = controller.processEmployee(emp);
			System.out.println(msg);
		} catch (Exception e) {
			e.printStackTrace();
		}

		//
		// get controller class object ref

		System.out.println("Enter the first Desg :");
		String desg1 = sc.next().toUpperCase();
		System.out.println("Enter the Second Desg :");
		String desg2 = sc.next().toUpperCase();
		System.out.println("Enter the Third Desg :");
		String desg3 = sc.next().toUpperCase();

		try {
			// invoke the b.method
			List<Employee> list = controller.ShowAllEmployeesByDesg(desg1, desg2, desg3);

			list.forEach(empData -> {
				System.out.println(empData);
			});
		} catch (Exception e) {
			e.printStackTrace();

		}

//		Setting data for MySQL ===========================================>>
/*
		System.out.println("Enter the  Name :");
		String MySQLdata1 = sc.next();
		System.out.println("Enter the  job:");
		String MySQLdata2 = sc.next();
		System.out.println("Enter the  salar:");
		Double MySQLdata3 = sc.nextDouble();
		Employee emp3 = new Employee();

		// setting data into bean
		emp3.setEname(data1);
		emp3.setJob(data2);
		emp3.setSalary(data3);

		try (ConfigurableApplicationContext ctx1 = SpringApplication.run(Boot_layered_app.class, args)) {
			PayrollOperationsControllerMySQL controller1 = ctx.getBean("payRollMySQL",
					PayrollOperationsControllerMySQL.class);

			String message = controller1.settingDatatoSQL(emp3);
			System.out.println(message);
		}

		catch (Exception e) {
			e.printStackTrace();
		}    */

		((ConfigurableApplicationContext) ctx).close();
	} // main
} // class
