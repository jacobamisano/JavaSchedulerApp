package org.openjfx.StaffScheduleFX;

import java.util.regex.Pattern;

public class StringHelper {
	//Note: no access modifier allows for files within the package to use the methods
	//REGEX CHEAT SHEET JAVA: http://tutorials.jenkov.com/java-regex/index.html#java-regular-expression-syntax
	
	static boolean textIsEmail(String textToCheck) {
		
		Pattern pattern = Pattern.compile("^[^@.]+@{1}[^@.]+.{1}[a-z]{1,3}$");
		
		
		if(pattern.matcher(textToCheck).find()) {
			return true;
		}
	    
		return false;
	}
	
	static boolean nameIsValid(String nameToCheck) {
		nameToCheck = nameToCheck.toLowerCase();
		Pattern pattern = Pattern.compile("^[a-z']+$");
		
		if(pattern.matcher(nameToCheck).find()) {
			return true;
		}
		
		return false;
	}
}
