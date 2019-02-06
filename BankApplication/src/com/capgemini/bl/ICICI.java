package com.capgemini.bl;

import java.util.LinkedList;

import com.capgemini.beans.Account;

public class ICICI {
	LinkedList<Account> accounts = new LinkedList<>();
	
	public String createAccount(int accountNumber, int amount)
	{
		Account account = new Account(accountNumber,amount);
		accounts.add(account);
		return "Account Created Successfully";
	}
	
	public int withdrawAmount(int accountNumber, int amount) throws InsufficientBalanceException, InvalidAccountNumberException
	{
		for(Account account:accounts)
		{
			if(account.getAccountNumber()==accountNumber)
			{
				if(account.getAmount()>amount)
				{
					account.setAmount(account.getAmount()-amount);
					return account.getAmount();
				}
				throw new InsufficientBalanceException();
			}
		}
		throw new InvalidAccountNumberException();
	}
	
	public String fundTransfer(int fromAccountNumber, int toAccountNumber, int amount)  throws InvalidAccountNumberException, InsufficientBalanceException
	{
		for(Account account:accounts)
		{
			if(account.getAccountNumber()==toAccountNumber)
			{
				int famt = withdrawAmount(fromAccountNumber,amount);
				account.setAmount(account.getAmount()+amount);
				int tamt = account.getAmount();
				return "Amount debited by "+amount+" new balance:"+famt+", Amount credited by "+amount+" new balance:"+tamt;
			}
		}
		throw new InvalidAccountNumberException();
	}
	public int deposit(int accountNumber, int amount)  throws InvalidAccountNumberException
	{
		for(Account account:accounts)
		{
			if(account.getAccountNumber()==accountNumber)
			{
				account.setAmount(account.getAmount()+amount);
				return account.getAmount();
			}
		}
		throw new InvalidAccountNumberException();
	}

}
