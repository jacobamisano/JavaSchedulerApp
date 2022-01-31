package org.openjfx.StaffScheduleFX;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javafx.scene.control.CheckBox;
import javafx.event.ActionEvent;
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
	private CheckBox checkBoxSunday;
	
	@FXML 
	private CheckBox checkBoxMonday;
	
	@FXML 
	private CheckBox checkBoxTuesday;
	
	@FXML 
	private CheckBox checkBoxWednesday;
	
	@FXML 
	private CheckBox checkBoxThursday;
	
	@FXML 
	private CheckBox checkBoxFriday;
	
	@FXML 
	private CheckBox checkBoxSaturday;
		
	@FXML 
	private CheckBox checkBoxAllDays;
	
	private List<String> checkedDays = new ArrayList<>();
	
	@FXML
	private void onBtnCancelEmployeeClick() throws IOException{
		App.setRoot("mainScreen");
	}
		
	@FXML
	private void onBtnAddEmployeeClick() throws IOException{
		if(isValidData()) {
			//TODO: Add Storing of employee data, Create Employee Object used for storing
			txtEmployeeName.setText("CONGRATULATIONS THE ADDING WORKED");
			Employee currentEmployee = new Employee(txtEmployeeName.getText(),
					txtEmployeeID.getText(), txtEmployeeEmailAddress.getText(), checkedDays);
			
			
		}
	}
	
	@FXML
	private void onCheckBoxCheck(ActionEvent event) {
		CheckBox callingBox = (CheckBox) event.getSource();
		
		
		if(checkedDays.contains(callingBox.getText())) {
			checkedDays.remove(callingBox.getText());
		} else {
			checkedDays.add(callingBox.getText());
		}
		//System.out.println(checkedDays.toString());
		lblEmployeeError.setText(callingBox.getText() + "\nBADJUASHDAUGNA");
			
	}
	
	@FXML
	private void onAllCheckBoxCheck(ActionEvent event) {
		if(checkBoxAllDays.isSelected()) {
			checkBoxSunday.setSelected(true);
			checkBoxMonday.setSelected(true);
			checkBoxTuesday.setSelected(true);
			checkBoxWednesday.setSelected(true);
			checkBoxThursday.setSelected(true);
			checkBoxFriday.setSelected(true);
			checkBoxSaturday.setSelected(true);
			checkedDays = Arrays.asList("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday",
					"Friday", "Satuday");
		} else {
			checkBoxSunday.setSelected(false);
			checkBoxMonday.setSelected(false);
			checkBoxTuesday.setSelected(false);
			checkBoxWednesday.setSelected(false);
			checkBoxThursday.setSelected(false);
			checkBoxFriday.setSelected(false);
			checkBoxSaturday.setSelected(false);
			
			checkedDays = new ArrayList<String>();
		}
		
		//System.out.println(checkedDays.toString());
		
	
		
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
			//System.out.println(lblEmployeeError.getText());
			return false;
		}
		
		
    	return true;
    }
	
	private boolean fieldFilled(TextField field) {
		if(field.getText() == "") {
			//System.out.println("Ran fieldFilled for " + field.getId());
			return false;
		}
		return true;
	}
	
	
	
}