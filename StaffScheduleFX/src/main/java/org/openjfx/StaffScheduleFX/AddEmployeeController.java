package org.openjfx.StaffScheduleFX;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import org.controlsfx.control.CheckComboBox;

import javafx.scene.control.CheckBox;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class AddEmployeeController {
	
	@FXML
	private Label lblEmployeeError;
	
	@FXML
	private TextField txtEmployeeName;
	
	@FXML 
	private TextField txtEmployeeID;
	
	@FXML
	private TextField txtEmployeeEmailAddress;
	
	@FXML
	private TextField txtEmployeePosition;
	
	@FXML
	private CheckComboBox<String> checkComboBoxDaysOfWeek;
	
	@FXML 
	private CheckBox checkBoxAllDays;
	
	@FXML
	private void onBtnCancelEmployeeClick() throws IOException{
		App.setRoot("mainScreen");
	}
		
	@FXML
	private void onBtnAddEmployeeClick() throws IOException{
		if(isValidData()) {
			//TODO: Add Storing of employee data, Create Employee Object used for storing
			txtEmployeeName.setText("CONGRATULATIONS THE ADDING WORKED");
		}
	}
	
	private boolean isValidData() {
		lblEmployeeError.setText("");
		
		if(!allFieldsFilled()) {
			return false;
		}
		
		if(!StringHelper.nameIsValid(txtEmployeeName.getText().trim())) {
			lblEmployeeError.setText(lblEmployeeError.getText() + "\nPlease enter a valid Name");
		}
		
		
		if(!StringHelper.textIsEmail(txtEmployeeEmailAddress.getText().trim())) {
			lblEmployeeError.setText(lblEmployeeError.getText() + "\nPlease enter a valid Email Address.");
		}
		
		if(lblEmployeeError.getText() != "") {
			return false;
		}
		return true;
	}
	
	private boolean allFieldsFilled() {    	
		if (!fieldFilled(txtEmployeeName)) {
			lblEmployeeError.setText(lblEmployeeError.getText() + "\nPlease fill out the Name field.");
		}
		
		if (!fieldFilled(txtEmployeeID)) {
			lblEmployeeError.setText(lblEmployeeError.getText() + "\nPlease fill out the ID field.");
		}
		
		if (!fieldFilled(txtEmployeeEmailAddress)) {
			lblEmployeeError.setText(lblEmployeeError.getText() + "\nPlease fill out the Email Address field.");
		}
		
		if (!fieldFilled(txtEmployeePosition)) {
			lblEmployeeError.setText(lblEmployeeError.getText() + "\nPlease fill out the Position field.");
		}
		
		if(lblEmployeeError.getText() != "") {
			return false;
		}
		
		
    	return true;
    }
	
	private boolean fieldFilled(TextField field) {
		if(field.getText() == "") {
			return false;
		}
		
		return true;
	}
	
	@FXML
	private void onCheckBoxCheck(CheckBox callingBox) {
		
	}
}