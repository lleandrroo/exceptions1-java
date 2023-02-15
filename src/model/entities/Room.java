package model.entities;

import model.enums.TypeRoom;

public class Room {
	private Double id;
	private TypeRoom type;
	private Boolean status;
	
	
	
	public boolean checkOccupancy() {
		if(status) {
			return true;
		}
		return false;
	}
}
