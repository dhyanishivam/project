package com.capgemini.service;

import com.capgemini.beans.Account;
import com.capgemini.exceptions.InsufficientBalanceException;
import com.capgemini.exceptions.InsufficientOpeningBalanceException;
import com.capgemini.exceptions.InvalidAccountNumberException;
import com.capgemini.repo.AccountRepo;

public class AccountServiceImpl implements AccountService {
	AccountRepo accountRepo;
	
	public AccountServiceImpl(AccountRepo accountRepo) {
		super();
		this.accountRepo = accountRepo;
	}
	public Account createAccount(int accountNumber,int amount) throws InsufficientOpeningBalanceException
	{
		if(amount<500)
		{
			throw new InsufficientOpeningBalanceException();
		}
		Account account = new Account();
		account.setAccountNumber(accountNumber);
		
		account.setAmount(amount);
		 
		if(accountRepo.save(account))
		{
			return account;
		}
	     
		return null;
		
	}
	public int deposit(int accountNumber, int amount) throws InvalidAccountNumberException
	{
		Account account = accountRepo.searchAccount(accountNumber);
		if(account == null)
		{
			throw new InvalidAccountNumberException();
		}
		account.setAmount(account.getAmount()+amount);
		accountRepo.save(account);
		return account.getAmount();
	}
	public int withdraw(int accountNumber, int amount) throws InsufficientBalanceException, InvalidAccountNumberException
	{
		Account account = accountRepo.searchAccount(accountNumber);
		if(account == null)
		{
			throw new InvalidAccountNumberException();
		}
		if(account.getAmount()<amount)
		{
			throw new InsufficientBalanceException();
		}
		account.setAmount(account.getAmount()-amount);
		accountRepo.save(account);
		return account.getAmount();
	}

}
