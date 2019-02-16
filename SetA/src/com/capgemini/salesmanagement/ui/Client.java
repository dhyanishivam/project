package com.capgemini.salesmanagement.ui;

import java.util.Scanner;

import com.capgemini.salesmanagement.service.SaleService;

public class Client {

	public static void main(String[] args) {
		SaleService saleService = new SaleService();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the product code:");
		int productId=sc.nextInt();
		
		if(!(saleService.validateProductCode(productId)))
		{
			System.out.println("Product Code Not valid");
			sc.close();
			System.exit(0);
		}
		System.out.println("Enter the quantity:");
		int qty=sc.nextInt();
		
		if(!(saleService.validateQuantity(qty)))
		{
			System.out.println("Product Quantity Not valid");
			sc.close();
			System.exit(0);
		}
		System.out.println("Product Category:");
		String prodCat=sc.next();
		
		if(!(saleService.validateProductCat(prodCat)))
		{
			System.out.println("Product Category Not valid");
			sc.close();
			System.exit(0);
		}
		System.out.println("Product Name:");
		String prodName=sc.next();
		
		if(!(saleService.validateProductName(prodName)))
		{
			System.out.println("Product Name Not valid");
			sc.close();
			System.exit(0);
		}
		System.out.println("Product Description:");
		String prodDescription=sc.next();
		
		System.out.println("Product Price(Rs):");
		int price=sc.nextInt();
		
		if(!(saleService.validateProductPrice(price)))
		{
			System.out.println("Product Price Not valid");
			sc.close();
			System.exit(0);
		}
		System.out.println("Line Total(Rs):");
		int lineTotal=sc.nextInt();

	}

}
