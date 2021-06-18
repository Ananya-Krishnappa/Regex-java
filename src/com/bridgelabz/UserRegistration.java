/**
 * Purpose:User Registration System needs to ensure all validations
	are in place during the User Entry
 * @author Ananya K
 * @version 1.0
 * @since 16/06/2021
 * 
 */
package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	/**
	 * This method validates the first name of user
	 * 
	 * @param name
	 * @return boolean
	 */
	public boolean isFirstNameValid(String name) {
		String regex = "[A-Z]{1}[a-z]{2,}";
		Pattern p = Pattern.compile(regex);
		if (name == null) {
			return false;
		}
		Matcher m = p.matcher(name);
		String result = m.matches() ? "First name is valid" : "First name is not valid";
		System.out.println(result);
		return m.matches();
	}

	/**
	 * This method validates the last name of user
	 * 
	 * @param name
	 * @return boolean
	 */
	public boolean isLastNameValid(String name) {
		String regex = "[A-Z]{1}[a-z]{2,}";
		Pattern p = Pattern.compile(regex);
		if (name == null) {
			return false;
		}
		Matcher m = p.matcher(name);
		String result = m.matches() ? "Last name is valid" : "Last name is not valid";
		System.out.println(result);
		return m.matches();
	}

	/**
	 * this validates the email string passed X* X,zero or more times X+ X,one or
	 * more times
	 * 
	 * @param email
	 * @return
	 */
	public boolean isEmailValid(String email) {
		String emailRegex1 = "^[a-zA-Z0-9]+(.*)[a-zA-Z0-9]+@+[a-zA-Z0-9]+(.+)[a-zA-Z0-9]+(.*)[a-zA-Z0-9]$";
		Pattern p = Pattern.compile(emailRegex1);
		if (email == null) {
			return false;
		}
		Matcher m = p.matcher(email);
		String result = m.matches() ? "Email is valid" : "Email is not valid";
		System.out.println(result);
		return m.matches();
	}

	/**
	 * this validates the phone number
	 * 
	 * @param email
	 * @return
	 */
	public boolean isPhoneNumValid(String phno) {
		String phNumRegex = "[9]{1}[1]{1}+\s{1}+[0-9]{10}";
		Pattern p = Pattern.compile(phNumRegex);
		if (phno == null) {
			return false;
		}
		Matcher m = p.matcher(phno);
		String result = m.matches() ? "Phone number is valid" : "Phone number is not valid";
		System.out.println(result);
		return m.matches();
	}

	/**
	 * this validates password with atleast one Capital
	 * 
	 * @param email
	 * @return
	 */
	public boolean isValidPassword(String password) {
		String regex1 = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[a-z])(?=[^\\p{Punct}]*[\\p{Punct}][^\\p{Punct}]*$).{8,}$";
		Pattern p = Pattern.compile(regex1);
		if (password == null) {
			return false;
		}
		Matcher m = p.matcher(password);
		String result = m.matches() ? "Password is valid" : "Password is not valid";
		System.out.println(result);
		return m.matches();
	}
}
