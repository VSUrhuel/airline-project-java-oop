import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Airplane a = new Airplane("FLY999");
		a.setBusinessClassCapacity(2);
		a.setEconomyCapacity(14);
		System.out.println(a);
		String[] passengerNames = new String[]{"Jayden Jimenez","Carleigh Lowery","Jameson Dickson","Aliyah Case","Kaiden Levine","Melvin Tanner","Mara Solomon","Fernando Vasquez","Solomon Diaz","Daniel Glover","Ariella Henderson","Kayden Mcdonald","Lilah Coleman","Natalia Conner","Vaughn Jensen","Janet Flores","Terrance Clay","Kale Montgomery","Maximillian Tran","Mekhi Delacruz","Mallory Perkins","Sloane Marshall","Osvaldo Le","Krystal Shaw","Annika Thomas","Blaine Kelley","Donna Joseph","Steve Young","Jaylen Juarez","Izaiah Rogers","Kylie Liu","Jensen Fletcher","Waylon Solomon","Moriah Waller","Raina Hill","Miles Brock","Sheldon Ortiz","Cecilia Young","Kirsten Yu","Azaria Mcguire","Krish Francis","Sanai Chandler","Shania Hooper","Danica Jacobson","Erica Huff","August Ball","Milo Hurst","Evelin Moss","Lea Hooper"};
		int ctr = 0;

		for(int i=1; i <= 3; i++)
		{
		    for(char c='V'; c < 'Z'; c++)
		    {
		        a.bookPassenger(new Passenger("Jay", false), i+""+c, BookingType.BusinessClass);
		    }
		}

		for(int i=7; i > 0; i--)
		{
		    for(char c='A'; c < 'H'; c++)
		    {
		        a.bookPassenger(new Passenger(passengerNames[ctr++], ctr%14 == 3), i+""+c, BookingType.Economy);
		    }
		}

		a.bookPassenger(new Passenger("Karen", false), "1D", BookingType.Economy);
		a.bookPassenger(new Passenger("Mark", true), "1G", BookingType.Economy);
		a.bookPassenger(new Passenger("Devon", false), "1A", BookingType.Economy);
		System.out.println(a);

		List<Passenger> pB = a.getAllBusinessClassPassengers();
		System.out.println("Business Class Passengers:");
		for(Passenger p : pB)
		    System.out.print(p);
		System.out.println();

		List<Passenger> pE = a.getAllEconomyPassengers();
		System.out.println("Economy Passengers:");
		for(Passenger p : pE)
		    System.out.print(p);
	
		Airplane b = new Airplane("FLY999");
		b.setBusinessClassCapacity(2);
		b.setEconomyCapacity(14);
		System.out.println(a);
		String[] passengerNames1 = new String[]{"Jayden Jimenez","Carleigh Lowery","Jameson Dickson","Aliyah Case","Kaiden Levine","Melvin Tanner","Mara Solomon","Fernando Vasquez","Solomon Diaz","Daniel Glover","Ariella Henderson","Kayden Mcdonald","Lilah Coleman","Natalia Conner","Vaughn Jensen","Janet Flores","Terrance Clay","Kale Montgomery","Maximillian Tran","Mekhi Delacruz","Mallory Perkins","Sloane Marshall","Osvaldo Le","Krystal Shaw","Annika Thomas","Blaine Kelley","Donna Joseph","Steve Young","Jaylen Juarez","Izaiah Rogers","Kylie Liu","Jensen Fletcher","Waylon Solomon","Moriah Waller","Raina Hill","Miles Brock","Sheldon Ortiz","Cecilia Young","Kirsten Yu","Azaria Mcguire","Krish Francis","Sanai Chandler","Shania Hooper","Danica Jacobson","Erica Huff","August Ball","Milo Hurst","Evelin Moss","Lea Hooper"};
		int ctr1 = 0;

		for(int i=1; i <= 3; i++)
		{
		    for(char c='V'; c < 'Z'; c++)
		    {
		        b.bookPassenger(new Passenger("Jay", false), i+""+c, BookingType.BusinessClass);
		    }
		}

		for(int i=1; i <= 7; i++)
		{
		    for(char c='A'; c < 'H'; c++)
		    {
		        b.bookPassenger(new Passenger(passengerNames[ctr++], ctr1%14 == 3), i+""+c, BookingType.Economy);
		    }
		}

		b.bookPassenger(new Passenger("Karen", false), "1D", BookingType.Economy);
		b.bookPassenger(new Passenger("Mark", true), "1G", BookingType.Economy);
		b.bookPassenger(new Passenger("Devon", false), "1A", BookingType.Economy);
		System.out.println(b);

		List<Passenger> pL = b.getAllBusinessClassPassengers();
		System.out.println("Business Class Passengers:");
		for(Passenger p : pL)
		    System.out.print(p);
		System.out.println();

		List<Passenger> pM = b.getAllEconomyPassengers();
		System.out.println("Economy Passengers:");
		for(Passenger p : pM)
		    System.out.print(p);
		
		Airplane c = new Airplane("OOP123");
		System.out.println(c);

		Airplane d = new Airplane("VIP143");
		d.setBusinessClassCapacity(12);
		d.setEconomyCapacity(88);
		System.out.println(d);
 
		Airplane e = new Airplane("FLY999");
		e.setBusinessClassCapacity(4);
		e.setEconomyCapacity(56);
		System.out.println(e);
		e.bookPassenger(new Passenger("Karen", false), "5D", BookingType.Economy);
		e.bookPassenger(new Passenger("Diva", false), "1Y", BookingType.BusinessClass);
		e.bookPassenger(new Passenger("Mark", true), "2C", BookingType.Economy);
		e.bookPassenger(new Passenger("Devon", false), "1G", BookingType.Economy);
		System.out.println(e);
		
		List<Passenger> pD = e.getAllBusinessClassPassengers();
		System.out.println("Business Class Passengers:");
		for(Passenger p : pD)
			System.out.print(e);
		System.out.println();

		List<Passenger> pF = e.getAllEconomyPassengers();
		System.out.println("Economy Passengers:");
		for(Passenger p : pF)
			System.out.print(p);
	
		Airplane f = new Airplane("YRT777");
		f.setBusinessClassCapacity(8);
		System.out.println(f);
		f.bookPassenger(new Passenger("Karen", false), "2X", BookingType.BusinessClass);
		f.bookPassenger(new Passenger("Diva", true), "1A", BookingType.Economy);
		f.bookPassenger(new Passenger("Mark", true), "6C", BookingType.Economy);
		f.bookPassenger(new Passenger("Devon", false), "1Z", BookingType.BusinessClass);
		System.out.println(f);

		Passenger p1 = new Passenger("Pedro", true);
		System.out.println(p1);
		Passenger p2 = new Passenger("Pedro", false);
		System.out.println(p1.equals(p2));

	}
}