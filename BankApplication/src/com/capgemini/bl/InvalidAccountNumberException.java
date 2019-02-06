package com.capgemini.bl;

public class InvalidAccountNumberException extends Exception {
	static String message="Invalid Account Number";

	public InvalidAccountNumberException() {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
