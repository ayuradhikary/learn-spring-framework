
package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring{
	public static void main(String[] args) {
		//Launch a Spring Context
		
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		// COnfigure the things that we want Spring to manage - @Configuration class  
	}
}