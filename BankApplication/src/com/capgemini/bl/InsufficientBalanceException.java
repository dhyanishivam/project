package com.capgemini.bl;

public class InsufficientBalanceException extends Exception {
	static String message="Insufficient Balance";

	public InsufficientBalanceException() {
		super(message);
		// TODO Auto-generated constructor stub
	}
}