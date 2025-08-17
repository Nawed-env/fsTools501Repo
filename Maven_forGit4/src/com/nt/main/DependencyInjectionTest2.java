package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.SeasonFinder;

public class DependencyInjectionTest2 {
	public static void main(String[] args) {
//		Create IOC container----->
    	
    	FileSystemXmlApplicationContext ctx= new FileSystemXmlApplicationContext("src/com/nt/cnfgs/applicationContext2.xml");
    	//Getting target Spring bean class obj reference--->>
    	Object obj=ctx.getBean("sf");
    	
    	//Typecasting(downcasting)------>>
    	SeasonFinder mausam=(SeasonFinder)obj;
    	
    	//invoke the b.method
    	String result=mausam.showSeason();
    	
    	System.out.println(result);
   	ctx.close(); //  <--close the IOC container>
    	
    	
	}
	
}
