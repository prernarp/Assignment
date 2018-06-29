package com.springannotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Market {
	@Autowired
	IProductInfo productInfo;
	
	public void getInfo() {
		productInfo.getProductInfo();
	}
	
}
