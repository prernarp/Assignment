package com.springannotation;

import org.springframework.stereotype.Component;

@Component("productInfo")
public class ProdectInfo implements IProductInfo {

	@Override
	public void getProductInfo() {
		// TODO Auto-generated method stub
		System.out.println("Product reached");
	}

}
