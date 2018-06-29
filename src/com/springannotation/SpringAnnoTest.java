package com.springannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAnnoTest {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		Market market = (Market) context.getBean("market2");
		//market.setOrderStatus("Order reached");
		market.getInfo();
		
	}
	
}

