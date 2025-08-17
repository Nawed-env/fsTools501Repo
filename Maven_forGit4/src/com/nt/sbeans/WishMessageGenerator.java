package com.nt.sbeans;

import java.time.LocalTime;

public class WishMessageGenerator {

	
	//HAS- A PROPERTY
	
	private LocalTime time;
	
	public WishMessageGenerator()
	{
		System.out.println("WishMessageGenerator.WishMessageGenerator()");
		
	}
	
//	Setters method for setter Injection---------->>
	
	public void seTime(LocalTime time)
	{
		this.time=time;
		System.out.println("from settterrr");
		
	}
	
//	Develop the b.method----------->
	
	public String showWishMessage(String user)
	{
		System.out.println("WishMessageGenerator.setTime()");
		
		//getting current hour of the day(pre-defined method) -------->==>
		int Hour=time.getHour();
		
		//Generate the wish message
		if(Hour<12)
			return "Good Morning!! "+user;
		
		else if(Hour<16)
			return "Good Afternoon!! "+user;
		
		else if(Hour<20)
			return "Good Evening!! "+user;
//		
		else
			return "Good Night!! "+user; //why error gone for return using else ?
	}
}
