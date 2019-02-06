package com.capgemini.view;

import com.capgemini.bl.ICICI;
import com.capgemini.bl.InsufficientBalanceException;
import com.capgemini.bl.InvalidAccountNumberException;

public class Client {

	public static void main(String[] args) {
		ICICI bank=new ICICI();
		
		System.out.println(bank.createAccount(456, 100));
		System.out.println(bank.createAccount(123, 40));
		try
		{
			System.out.println("Balance:"+bank.deposit(123, 100));
		}
		
		catch(InvalidAccountNumberException i)
		{
			i.getMessage();
		}
		/*catch(InsufficientBalanceException ibe)
		{
			System.out.println("Insufficient balance");
		}*/


	}

}
