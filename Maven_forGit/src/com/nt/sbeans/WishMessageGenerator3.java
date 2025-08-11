package com.nt.sbeans;
import java.time.LocalDate;
	import java.time.LocalTime;
public class WishMessageGenerator3 {
	
//		has a property
		private LocalTime time;
		private LocalDate date;
		
//		simple property
		private int age;
		private String email;
		
		


		
		public WishMessageGenerator3()
		{
			System.out.println("constructor 0 param");
			
		}
		
		
		
		
		
		
		public WishMessageGenerator3(LocalTime time, LocalDate date, int age, String email) {
			
			System.out.println("Parameterized constructor");
			this.time = time;
			this.date = date;
			this.age = age;
			this.email = email;
		}






		public String showWishMessage(String user)
		{
			
			System.out.println("showWishMessage method()");
			
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



