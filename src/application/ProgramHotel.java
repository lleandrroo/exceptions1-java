package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;

public class ProgramHotel {

	public static void main(String[] args) throws ParseException {
		
		 /*
		 * Fazer um programa para ler os dados de uma reserva de hotel (número do
		 * quarto,data de entrada e data de saída) e mostrar os dados da reserva,
		 * inclusive a sua duração em dias. Em seguida, ler novas datas de entrada
		 * e saída, atualizar a reserva, e mostrar novamente a reserva com os dados
		 * atualizados. O programa não deve aceitar dados inválidos para reserva, 
		 * conforme as seguintes regras: 
		 * 
		 * Alterações de reseva só podem ocorrer para datas futuras
		 * A data de saída deve ser maior qua a data de entrada
		 *  	
		 * 	
		 * Reservation
		 * -roomNumber: Integer
		 * -checkin: Date
		 * -checkout: Date
		 * --------------------
		 * +duration():Integer
		 * +upDates(checkin:Date,checkout:Date):void
		 */
		
		
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Room number: ");
		int number = sc.nextInt();
		System.out.print("Check-in date (dd/MM/yyyy): ");
		Date checkIn = sdf.parse(sc.next());
		System.out.print("Check-on date (dd/MM/yyyy): ");
		Date checkOut = sdf.parse(sc.next());
		
		Date now = new Date();
		
		if(checkIn.before(now) || checkOut.before(now)){
			System.out.println("Error in reservation: Reservation dates must be future dates");
		}else if(!checkOut.after(checkIn)) {
				System.out.println("Error in reservation: check-out data must be after check-in date");
		}else {
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
			
			System.out.println();
			System.out.println("Enter update the reservation: ");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkIn = sdf.parse(sc.next());
			System.out.print("Check-on date (dd/MM/yyyy): ");
			checkOut = sdf.parse(sc.next());
			
			// Bad Actualization 
			if(checkIn.before(now) || checkOut.before(now)){
				System.out.println("Error in reservation: Reservation dates for update must be future dates");
			}else if(!checkOut.after(checkIn)) {
				System.out.println("Error in reservation: check-out data must be after check-in date");
			}else {
				reservation.upDates(checkIn, checkOut);
				System.out.println("Reservation: " + reservation);
			}
		}
	
		
		
		
		sc.close();

	}

}
