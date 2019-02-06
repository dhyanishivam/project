package com.capgemini.test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.capgemini.beans.Account;
import com.capgemini.exceptions.InsufficientBalanceException;
import com.capgemini.exceptions.InsufficientOpeningBalanceException;
import com.capgemini.exceptions.InvalidAccountNumberException;
import com.capgemini.repo.AccountRepo;
import com.capgemini.service.AccountService;
import com.capgemini.service.AccountServiceImpl;

public class AccountServiceImpleTest {
	AccountService accountService;
	
	@Mock
	AccountRepo accountRepo;
	
	@Before
	public void setUp() throws Exception
	{
		MockitoAnnotations.initMocks(this);
		accountService = new AccountServiceImpl(accountRepo);
	}
	
	@Test(expected=com.capgemini.exceptions.InsufficientOpeningBalanceException.class)
	public void whenTheAmountIsLessThan500SystemShouldThrowExceptionForDeposit() throws InsufficientOpeningBalanceException
	{
		accountService.createAccount(101, 400);
	}
	
	@Test
	public void whenTheValidInfoIsPassedAccountShouldBeCreatedSuccessfully() throws InsufficientOpeningBalanceException
	{
		accountService.createAccount(101, 1000);
	}

	@Test(expected=com.capgemini.exceptions.InvalidAccountNumberException.class)
	public void whenTheAmountIsLessThan500SystemShouldThrowException() throws InvalidAccountNumberException
	{
		accountService.deposit(101, 5000);
	}
	
	@Test
	public void whenTheValidInfoIsPassedAmountShouldBeDepositedSuccessfully() throws InvalidAccountNumberException
	{
		Account account = new Account();
		account.setAccountNumber(101);
		account.setAmount(5000);
		when(accountRepo.searchAccount(101)).thenReturn(account);
		assertEquals(account.getAmount()+500,accountService.deposit(101, 500));
	}
	@Test(expected=com.capgemini.exceptions.InvalidAccountNumberException.class)
	public void whenTheValidAccountNumberIsNotPassedForWithdrawSystemShouldThrowException() throws InsufficientBalanceException, InvalidAccountNumberException
	{
		accountService.withdraw(101, 5000);
	}
	@Test(expected=com.capgemini.exceptions.InsufficientBalanceException.class)
	public void whenTheAmountIsNotSufficientSystemShouldThrowException()  throws InsufficientBalanceException, InvalidAccountNumberException
	{
		Account account = new Account();
		account.setAccountNumber(101);
		account.setAmount(5000);
		when(accountRepo.searchAccount(101)).thenReturn(account);
		accountService.withdraw(101, 6000);
	}
	
	@Test
	public void whenTheValidInfoIsPassedAmountShouldBeWithdrawnSuccessfully() throws InsufficientBalanceException, InvalidAccountNumberException
	{
		Account account = new Account();
		account.setAccountNumber(101);
		account.setAmount(5000);
		when(accountRepo.searchAccount(101)).thenReturn(account);
		assertEquals(account.getAmount()-500,accountService.withdraw(101, 500));
	}
	

}
