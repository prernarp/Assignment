package com.springannotation;

import org.springframework.stereotype.Component;

@Component("myProduct")
public class MyProduct implements IProductInfo {

	@Override
	public void getProductInfo() {
		// TODO Auto-generated method stub
		System.out.println("Order plced");
	}

}
