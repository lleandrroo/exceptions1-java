package model.entities;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
	
	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	private LocalDate checkI;
	private LocalDateTime checkO;

	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	public static DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
	public static DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

	
	public Reservation() {
		
	}

	public Reservation(int roomNumber, Date checkIn, Date checkOut) {
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckin() {
		return checkIn;
	}

	public Date getCheckout() {
		return checkOut;
	}

	public long duration() {
		long diff = checkOut.getTime() - checkIn.getTime(); // turnaround time in milliseconds	
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS); // convert milleconds to days;					
		
	}
	
	public String upDates(Date checkin, Date checkout) {
		//Solução 2 (ruim): método retornando string (Linguagem C)
		Date now = new Date();
		if(checkIn.before(now) || checkOut.before(now)){
			return "Error in reservation: Reservation dates must be future dates";
		}
		if(!checkOut.after(checkIn)) {
			return "Error in reservation: check-out data must be after check-in date";
		}
		
		this.checkIn = checkin;
		this.checkOut = checkout;
		return null;
	}
	
	@Override
	public String toString() {
		return "Room :"
			   + roomNumber
			   + ", check-in: "
			   + sdf.format(checkIn)
			   + ", check-out: "
			   + sdf.format(checkOut)
			   + ", "
			   + duration()
			   + " nights";
			   
	}
	
	
}
