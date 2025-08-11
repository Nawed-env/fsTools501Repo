package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.WishMessageGenerator3;

public class DependencyInjectionTest4 {

	
	public static void main(String[] args) {
		
		System.out.println("Let's execute");
		
		FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/nt/cnfgs/applicationContext4.xml");
		
//		Object obj=ctx.getBean("wmg");
		WishMessageGenerator3 generator=(WishMessageGenerator3)ctx.getBean("wmg");
		
		System.out.println(generator.showWishMessage("Ultron"));
		ctx.close();
	}
}
