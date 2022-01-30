package org.openjfx.StaffScheduleFX;


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
	
	
	
}
