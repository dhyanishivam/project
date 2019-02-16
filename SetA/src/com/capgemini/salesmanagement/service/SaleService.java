package com.capgemini.salesmanagement.service;

import java.util.HashMap;

import com.capgemini.salesmanagement.bean.Sale;

public class SaleService implements ISaleService {
	static String temp;

	@Override
	public HashMap<Integer, Sale> insertSalesDetails(Sale sale) {
		
		return null;
	}

	@Override
	public boolean validateProductCode(int productId) {
		if(productId==1001 || productId==1002 || productId==1003 || productId==1004)
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean validateQuantity(int qty) {
		if(qty>0 && qty<5)
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean validateProductCat(String prodCat) {
		if(prodCat.equals("Electronics"))
		{
			temp="Electronics";
			return true;
		}
		else if(prodCat.equals("Toys"))
		{
			temp="Toys";
			return true;
		}
		return false;
	}

	@Override
	public boolean validateProductName(String prodName) {
		if(temp.equals("Electronics"))
		{
			if(prodName.equals("TV") || prodName.equals("Smart Phone") || prodName.equals("Video Game"))
			{
				return true;
			}
			return false;
		}
		else if(temp.equals("Toys"))
		{
			if(prodName.equals("Soft Toy") || prodName.equals("Telescope") || prodName.equals("Barbee Doll"))
			{
				return true;
			}
			return false;
		}
		return false;
	}

	@Override
	public boolean validateProductPrice(float price) {
		if(price>200)
		{
			return true;
		}
		return false;
	}

}
