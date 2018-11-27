package leducvu.com;

public class main {
	public static void main(String[] args) {
		cinema cinema=new cinema("CGV",8,12);
		cinema.printcinemaSeats();
		if(cinema.reserveSeat("A12")){
			System.out.println("Tra tien cho viec dat ghe");
		}else{
			System.out.println("Ghe da duoc dat");
		}
		System.out.println("------------");
		
		if(cinema.reserveSeat("A04")){
			System.out.println("Tra tien cho viec dat ghe");
		}else{
			System.out.println("Ghe da duoc dat");
		}
		System.out.println("------------");
		if(cinema.reserveSeat("A12")){
			System.out.println("Tra tien cho viec dat ghe");
		}else{
			System.out.println("Ghe da duoc dat");
		}
	}
}