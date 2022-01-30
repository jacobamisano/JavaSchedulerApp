package org.openjfx.StaffScheduleFX;

import java.util.regex.Pattern;

public class StringHelper {
	//Note: no access modifier allows for files within the package to use the methods
	//REGEX CHEAT SHEET: https://developer.mozilla.org/en-US/docs/Web/JavaScript/Guide/Regular_Expressions/Cheatsheet
	
	static boolean textIsEmail(String textToCheck) {
		Pattern pattern = Pattern.compile("^[/w]+[@]{1}[/w]+[.]{1}[/w]{1,3}$");
		
		if(pattern.matcher(textToCheck.trim()).find()) {
			return true;
		}
	    
		return false;
	}
	
	static boolean nameIsValid(String nameToCheck) {
		Pattern pattern = Pattern.compile("^[");
		
		
		return false;
	}
}
