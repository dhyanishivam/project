package com.capgemini.capstore.dao;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.capstore.beans.Category;
import com.capgemini.capstore.beans.Merchant;
import com.capgemini.capstore.beans.Product;

public class SortingProductsDAO{
	
	List<Product> allProducts = new ArrayList<>();

	public SortingProductsDAO() {
		super();
		Merchant merchant = new Merchant();
		List<Merchant> merchants;
		Category category = Category.Electronics;
		
		//allProducts.add(new Product(100, 5000, "Mixer", "", category, "Bajaj", "b01", "Home-Appliance", "Mixer", merchants));
	}

	

	
	

}
