package com.bridgelabz;

import java.util.Scanner;

public class UserRegistrationMain {
	public static void main(String[] args) {
		UserRegistration ur = new UserRegistration();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name");
		String fn = sc.nextLine();
		ur.isFirstNameValid(fn);
		System.out.println("Enter last name");
		String ln = sc.nextLine();
		ur.isLastNameValid(ln);
		System.out.println("Enter email");
		String email = sc.nextLine();
		ur.isEmailValid(email);
		System.out.println("Enter phone number");
		String phno = sc.nextLine();
		ur.isPhoneNumValid(phno);
		sc.close();
	}
}
