/**
 * Purpose:To validate email ids
 * @author Ananya K
 * @version 1.0
 * @since 16/06/2021
 * 
 */
package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmail {

	/**
	 * this validates the email string passed X* X,zero or more times X+ X,one or
	 * more times
	 * 
	 * @param email
	 * @return
	 */
	public static boolean isEmailValid(String email) {
		String emailRegex1 = "^[a-zA-Z0-9]+(.??)[a-zA-Z0-9]+@+[a-zA-Z0-9]+(.+)[a-zA-Z0-9]*(.+)[a-zA-Z]{2,}$";
		Pattern p = Pattern.compile(emailRegex1);
		if (email == null) {
			return false;
		}
		Matcher m = p.matcher(email);
		String result = m.matches() ? "Email " + email + " is valid" : "Email " + email + " is not valid";
		System.out.println(result);
		return m.matches();
	}

	public static void main(String[] args) {
		String email1 = "abc@yahoo.com";
		String email2 = "abc-100@yahoo.com";
		String email3 = "abc.100@yahoo.com";
		String email4 = "abc-100@abc.net";
		String email5 = "abc.100@abc.com.au";
		String email6 = "abc@1.com";
		String email7 = "abc@gmail.com.com";
		String email8 = "abc+100@gmail.com";
		String email9 = "abc";
		String email10 = "abc@.com.my";
		String email11 = "abc123@gmail.a";
		String email12 = "abc123@.com";
		String email13 = "abc123@.com.com";
		String email14 = ".abc@abc.com";
		String email15 = "abc()*@gmail.com";
		String email16 = "abc..2002@gmail.com";
		String email17 = "abc.@gmail.com";
		String email18 = "abc@abc@gmail.com";
		String email19 = "abc@gmail.com.1a";
		String email20 = "abc@gmail.com.aa.au ";
		String email21 = "abc@%*.com";

		isEmailValid(email1);
		isEmailValid(email2);
		isEmailValid(email3);
		isEmailValid(email4);
		isEmailValid(email5);
		isEmailValid(email6);
		isEmailValid(email7);
		isEmailValid(email8);
		isEmailValid(email9);
		isEmailValid(email10);
		isEmailValid(email11);
		isEmailValid(email12);
		isEmailValid(email13);
		isEmailValid(email14);
		isEmailValid(email15);
		isEmailValid(email16);
		isEmailValid(email17);
		isEmailValid(email18);
		isEmailValid(email19);
		isEmailValid(email20);
		isEmailValid(email21);
	}
}
