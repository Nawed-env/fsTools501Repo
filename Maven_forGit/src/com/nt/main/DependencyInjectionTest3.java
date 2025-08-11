package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.wishMessageGenerator2;

public class DependencyInjectionTest3 {
	
	
	public static void main(String[] args) {
		
		FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/nt/cnfgs/applicationContext3.xml");
		
		Object obj=ctx.getBean("wmg");
		wishMessageGenerator2 wish=(wishMessageGenerator2)obj;
		
	System.out.println(wish.getAge());
	System.out.println(wish.getDate());
		
		
		
		
		
		
		
	}

}
