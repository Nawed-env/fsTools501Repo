package com.nt.sbeans;

import java.time.LocalDate;

public class SeasonFinder {
	
	//HAS- A PROPERTY
	
		private LocalDate date;
		
		public SeasonFinder()
		{
			System.out.println("Season finder application");
			
		}
		
//		Setters method for setter Injection---------->>
		
		public void setDate(LocalDate finder)
		{
			this.date=finder;
			
		}
		
//		Develop the b.method----------->
		
		public String showSeason()
		{
			System.out.println("Season finder");
			
			//getting current hour of the day(pre-defined method) -------->==>
			int month=date.getMonthValue();
			
			//Generate the wish message
			if( month<2)
				return "Winter!! ";
			
			else if(month<4)
				return "Spring !!";
			
			else if(month<6)
				return "Summer";
			
			else if(month<9)
				return "Rainy" ;
			
			else if(month<9)
				return "Start Winter";
			
			else
			     return "issue";
//			
			
		}

}
