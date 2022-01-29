package org.openjfx.StaffScheduleFX;

import java.time.LocalDateTime;

import org.openjfx.StaffScheduleFX.Employee.PositionType;

public class Shift {
	
	private Integer employeesForShift;
	private String dayOfWeek;
	private LocalDateTime startTime;
	private LocalDateTime endTime;
	private PositionType positionRequirement;
	
	public Shift () {
		employeesForShift = null;
		dayOfWeek = null;
		startTime = null;
		endTime = null;
		positionRequirement = null;
	}
	
	public Shift(Integer employeesForShift, String dayOfWeek,
			LocalDateTime startTime, LocalDateTime endTime,
			PositionType positionRequirement) {
	
		this.employeesForShift = employeesForShift;
		this.dayOfWeek = dayOfWeek;
		this.startTime = startTime;
		this.endTime = endTime;
		this.positionRequirement = positionRequirement;
	}
}
