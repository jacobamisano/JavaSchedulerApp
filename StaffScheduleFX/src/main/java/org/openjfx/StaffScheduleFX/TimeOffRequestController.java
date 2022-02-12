package org.openjfx.StaffScheduleFX;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TimeOffRequestController {
	
	@FXML
	TextField txtEmployeeSubmittingRequest;
	
	@FXML
	TextField txtStartRequestDate;
	
	@FXML
	TextField txtStartRequestTime;
	
	@FXML
	TextField txtEndRequestDate;
	
	@FXML
	TextField txtEndRequestTime;
	
	@FXML
	TextField txtDateOfRequest;
	
	@FXML
	Button btnTimeOffRequestSubmit;
	
	@FXML
	Label lblTimeOffRequestError;
	
	private LocalDateTime parsedStartDateTime;
	private LocalDateTime parsedEndDateTime;
	private LocalDate parsedDateOfRequest;
	
	@FXML
	private void onBtnTimeOffRequestSubmitClick() {
		if (isValidTimeOffRequestData()) {
			
			System.out.println("Yay successful time off request!!!");
		} else {
			System.out.println("Uh Oh Stinky! Bad Time Off Request!");
		}
	}
	
	@FXML
	private void onBtnTimeOffRequestCancelClick() throws IOException{
		App.setRoot("mainScreen");
	}
	
	private boolean isValidTimeOffRequestData() {
		//Note: Error message is handled in the allFieldsFilled method
		if (!allFieldsFilled()) {
			return false;
		}
		
		if(!isCorrectFormatting()) {
			return false;
		}
		
		
		return true;
	}
	
	@FXML
	private boolean allFieldsFilled() {
		
		lblTimeOffRequestError.setText("");
		
		if(txtStartRequestDate.getText() == "") {
			lblTimeOffRequestError.setText(lblTimeOffRequestError.getText() + "\nPlease fill out the start date for the request.");
		}
		
		if(txtStartRequestTime.getText() == "") {
			lblTimeOffRequestError.setText(lblTimeOffRequestError.getText() + "\nPlease fill out the start time for the request.");
		}
		
		if(txtEndRequestDate.getText() == "") {
			lblTimeOffRequestError.setText(lblTimeOffRequestError.getText() + "\nPlease fill out the end date for the request.");
		}
		
		if(txtEndRequestTime.getText() == "") {
			lblTimeOffRequestError.setText(lblTimeOffRequestError.getText() + "\nPlease fill out the end time for the request.");
		}
		
		if (txtEmployeeSubmittingRequest.getText() == "") {
			lblTimeOffRequestError.setText(lblTimeOffRequestError.getText() + "\nPlease fill out the employee submitting the request.");
		}
		
		if(lblTimeOffRequestError.getText() != "") {
			return false;
		}
		
		return true;
	}
	
	private boolean isCorrectFormatting() {
		
		lblTimeOffRequestError.setText("");
		
		if(!StringHelper.isDateFormat(txtStartRequestDate.getText()) || !StringHelper.isDateFormat(txtEndRequestDate.getText())) {
			lblTimeOffRequestError.setText("Please use the format MM/DD/YYYY for dates. Check your start date and end date format.");
		}
		
		if(!StringHelper.isTimeFormat(txtStartRequestTime.getText()) || !StringHelper.isTimeFormat(txtEndRequestTime.getText())) {
			lblTimeOffRequestError.setText("Please use the format 'HH:MM AM/PM' for times. Check your start time and/or end time");
		}
		
		if(lblTimeOffRequestError.getText() != "") {
			return false;
		}
		
		return true;
	}
	
	
}
