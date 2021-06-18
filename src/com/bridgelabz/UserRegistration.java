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
		return m.matches();
	}
}
