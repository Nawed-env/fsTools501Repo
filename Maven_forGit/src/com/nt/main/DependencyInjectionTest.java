package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.WishMessageGenerator;

public class DependencyInjectionTest {

    public static void main(String[] args) {
//		Create IOC container----->
    	
    	FileSystemXmlApplicationContext ctx= new FileSystemXmlApplicationContext("src/com/nt/cnfgs/applicationContext.xml");
    	//Getting target Spring bean class obj reference--->>
    	Object obj=ctx.getBean("wmg");
    	
    	//Typecasting(downcasting)------>>
    	WishMessageGenerator generator=(WishMessageGenerator)obj; 
    	
    	//invoke the b.method
    	String result=generator.showWishMessage("Nawed");
    	
    	System.out.println(result);
   	ctx.close(); //  <--close the IOC container>
    	
    	
	}
}
