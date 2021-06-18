package com.bridgelabz;

public class UserRegistrationMain {
	public static void main(String[] args) {
		UserRegistration ur = new UserRegistration();
		String fn = "Ananya";
		System.out.println(ur.isFirstNameValid(fn));
	}
}
