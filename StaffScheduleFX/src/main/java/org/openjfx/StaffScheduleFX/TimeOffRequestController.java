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
		if(!StringHelper.isDateFormat(txtStartRequestDate.getText())) {
			return false;
		}
		
		
		return true;
	}
	
	@FXML
	private boolean allFieldsFilled() {
		
		if(txtStartRequestDate.getText() == "" || txtStartRequestTime.getText() == "" || txtEndRequestDate.getText() == "" ||
				txtEndRequestTime.getText() == "" || txtEmployeeSubmittingRequest.getText() == "") {
			return false;
		}
		
		return true;
	}
	
	
}
