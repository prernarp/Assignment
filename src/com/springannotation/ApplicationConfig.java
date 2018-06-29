package com.springannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.springannotation")
public class ApplicationConfig {
	
	@Bean
	public Market market2() {
		Market market =new Market();
		return market;
	}
	
}
