package com.bridgelabz;

public class UserRegistrationMain {
	public static void main(String[] args) {
		UserRegistration ur = new UserRegistration();
		String fn = "Anu";
		System.out.println((ur.isFirstNameValid(fn)));
	}
}
