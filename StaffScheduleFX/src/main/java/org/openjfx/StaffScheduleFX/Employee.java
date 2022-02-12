package org.openjfx.StaffScheduleFX;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Employee {
	
	private String name;
	private String id;
	private String emailAddress;
	private PositionType position;
	private List<String> availableDays;
	
	public enum PositionType {
		
	}
	
	//START Constructors 
	public Employee () {
		name = null;
		id = null;
		emailAddress = null;
		availableDays = null;
	}
	
	public Employee(String name, String id,
			String emailAddress, List<String> days) {
		this.name = name;
		this.id = id;
		this.emailAddress = emailAddress;
		this.availableDays = days;
	}
	
	public Employee(String name, String id,
			String emailAddress) {
		this.name = name;
		this.id = id;
		this.emailAddress = emailAddress;
		this.availableDays = Arrays.asList("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday",
				"Friday", "Satuday");
		
	}
	//END Constructors
	public boolean addAvailableDay(String day) {
		if(!this.availableDays.contains(day)) {
			this.availableDays.add(day);
			return true;
		}
		return false;
	}
}
