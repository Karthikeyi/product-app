package com.srkr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmailApplication {
	public static void main(String[] args) {
		//EmailClinet e=new EmailClinet();
		//e.sendEmail("maven project");
		
		//create container
		ApplicationContext con =new ClassPathXmlApplicationContext("beans.xml");
		EmailClinet ec=con.getBean("emailClient",EmailClinet.class);
		ec.sendEmail("STRING FRAMEWROK USING MAVEN DEPENDENCIES.BY USING LOOSE COUPLING");
		
		
		
	}

}
