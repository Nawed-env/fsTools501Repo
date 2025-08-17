package com.nt.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

public class wishMessageGenerator2 {
	
//	has a property
	private LocalTime time;
	private LocalDate date;
	
//	simple property
	private int age;
	private String email;
	
	
public LocalTime getTime() {
	System.out.println("Hii!! from Getters");
		return time;
		
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	public LocalDate getDate() {
		System.out.println("Hii!! from Getters");

		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public int getAge() {
		System.out.println("Hii!! from Getters");

		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		System.out.println("Hii!! from Getters");

		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	public wishMessageGenerator2()
	{
		System.out.println("constructor 0 param");
		
	}
	
	
	
	

}
