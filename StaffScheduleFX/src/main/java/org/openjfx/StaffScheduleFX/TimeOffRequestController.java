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
	TextField txtStartDateTime;
	
	@FXML
	TextField txtEndDateTime;
	
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
		
	}
	
	@FXML
	private void onBtnTimeOffRequestCancelClick() throws IOException{
		App.setRoot("mainScreen");
	}
	
	
}
