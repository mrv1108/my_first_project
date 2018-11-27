package leducvu.com;

import java.util.ArrayList;

public class cinema {
	private String cinemaName;
	private ArrayList<Seat> seats = new ArrayList<Seat>();
	public cinema(String cinemaName, int numRow, int seatPerRow){
		this.cinemaName=cinemaName;
		int lastRow='A'+numRow-1;
		for(char row='A';row<=lastRow;row++){
			for(int seatNum=1;seatNum<=seatPerRow;seatNum++){
				Seat seat=new Seat(row+String.format("%02d", seatNum));
				seats.add(seat);
			}
		}
		
	}
	public boolean reserveSeat(String seatNumber){
		Seat requestSeat=null;
		for(Seat seat:seats){
			if(seat.getSeatNumber().equals(seatNumber)){
				requestSeat=seat;
				break;
			}
		}
		if(requestSeat==null){
			System.out.println("Ghe ban dat khong ton tai");
			return false;
		}
		return requestSeat.reserve();
	}
	public void printcinemaSeats(){
		for(Seat seat:seats){
			System.out.println(seat.getSeatNumber());
		}
	}
	public String getcinemaName() {
		return cinemaName;
	}
	public void setcinemaName(String cinemaName) {
		this.cinemaName = cinemaName;
	}
	public ArrayList<Seat> getSeats() {
		return seats;
	}
	public void setSeats(ArrayList<Seat> seats) {
		this.seats = seats;
	}
	
}
