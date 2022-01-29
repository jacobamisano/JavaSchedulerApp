package org.openjfx.StaffScheduleFX;

import java.util.Arrays;
import java.util.List;

public class Employee {
	
	private String name;
	private String id;
	private String emailAddress;
	private PositionType position;
	private List<AvailableDays> days;
	
	public enum AvailableDays {
		SUNDAY,
		MONDAY,
		TUESDAY,
		WEDNESDAY,
		THURSDAY,
		FRIDAY,
		SATURDAY
	}
	
	public enum PositionType {
		
	}
	
	//START Constructors 
	public Employee () {
		name = null;
		id = null;
		emailAddress = null;
		days = null;
	}
	
	public Employee(String name, String id,
			String emailAddress, List<AvailableDays> days) {
		this.name = name;
		this.id = id;
		this.emailAddress = emailAddress;
		this.days = days;
	}
	
	public Employee(String name, String id,
			String emailAddress) {
		this.name = name;
		this.id = id;
		this.emailAddress = emailAddress;
		this.days = Arrays.asList(AvailableDays.SUNDAY, AvailableDays.MONDAY, AvailableDays.TUESDAY,
				AvailableDays.WEDNESDAY, AvailableDays.THURSDAY, AvailableDays.FRIDAY, AvailableDays.SATURDAY);
	
	}
	
	
	
}
