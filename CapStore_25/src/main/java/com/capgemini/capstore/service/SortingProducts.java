package com.capgemini.capstore.service;

import java.util.List;

import com.capgemini.capstore.beans.Product;

public interface SortingProducts {
	
	List<Product> sortProductsByPriceLowToHigh();
	List<Product> sortProductsByPriceHighToLow();
	List<Product> sortProductsByGivenPriceRange(); 

}
