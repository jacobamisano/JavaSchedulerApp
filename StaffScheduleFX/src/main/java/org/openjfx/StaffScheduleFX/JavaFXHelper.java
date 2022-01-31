package org.openjfx.StaffScheduleFX;


import java.time.LocalDate;
import java.util.List;

import javafx.scene.control.TextField;

public class JavaFXHelper {
	//Note: No access modifier allows the package to access the following methods
	
	static boolean isTextFieldEmpty(TextField textField) {
		if (textField.getText() == "") {
			return true;
		}else {
			return false;
		}
	}
	
	static LocalDate parseToLocalDate (String stringToParse) {
		String[] delimited = stringToParse.split("/");
		
		if (delimited.length == 3) {
			return LocalDate.of(Integer.parseInt(delimited[2]), Integer.parseInt(delimited[0]) , Integer.parseInt(delimited[1]));
		} else {
			return null;
		}
	}
	
}
