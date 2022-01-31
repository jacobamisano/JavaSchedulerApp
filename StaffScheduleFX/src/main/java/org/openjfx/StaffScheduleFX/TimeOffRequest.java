package org.openjfx.StaffScheduleFX;

import java.time.LocalDate;
import java.time.LocalDateTime;


public class TimeOffRequest {
	private String employeeSubmittingRequest;
	private LocalDateTime startDateTime;
	private LocalDateTime endDateTime;
	private LocalDate dateOfRequest;
	

	
	public TimeOffRequest () {
		employeeSubmittingRequest = null;
		startDateTime = null;
		endDateTime = null;
		dateOfRequest = null;
	}
	
	public TimeOffRequest (String employeeSubmittingRequest, LocalDateTime startDateTime,
			LocalDateTime endDateTime, LocalDate dateOfRequest) {
		this.employeeSubmittingRequest = employeeSubmittingRequest;
		this.startDateTime = startDateTime;
		this.endDateTime = endDateTime;
		this.dateOfRequest = dateOfRequest;
	}
	
	
	
}
