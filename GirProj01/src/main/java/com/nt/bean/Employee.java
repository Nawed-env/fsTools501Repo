package com.nt.bean;
  //java baen class

import io.micrometer.common.lang.NonNull;
import lombok.Data;
import lombok.RequiredArgsConstructor;



@Data  //give setter,getter,toString,hashCode and etc method
//@RequiredArgsConstructor ...need constructor injection  then enable t
public class Employee {
	private Integer eno;
//	@NonNull
	private String ename;  
//	@NonNull
	private String job;
//	@NonNull
	private Double salary;
	private Integer deptno;
	private Double grossSalary;
	private Double netSalary;
	

}
