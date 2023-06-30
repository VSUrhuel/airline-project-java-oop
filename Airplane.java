import java.util.*;
public class Airplane
{
	private String name;
	private int economyCapacity;
	private int businessClassCapacity;
	private int numEconomyPassenger;
	private int numBusinessClassPassenger;
	private BookingType type;
	private Seat[] economySeats;
	private Seat[] businessClassSeats;

	public Airplane(String name)
	{
		this.name = name;
		this.economyCapacity = 49;
		this.businessClassCapacity = 0;
		this.numEconomyPassenger = 0;
		this.numBusinessClassPassenger = 0;
		this.economySeats = new Seat[economyCapacity];
		this.businessClassSeats = new Seat[businessClassCapacity];
		int j = 0;
		for(int i=1; i<= economySeats.length / 7; i++)
		{
			for(int m=0; m<7; m++)
			{
				this.economySeats[j++] = new Seat(i +""+ (char)('A'+m));
			}
		}
	}
	public void setEconomyCapacity(int capacity)
	{
		if((numEconomyPassenger == 0) && (capacity >= 49 && capacity % 7 == 0))
		{
			this.economyCapacity = capacity;
			this.economySeats = null;
			this.economySeats = new Seat[economyCapacity];
			int j = 0;
			for(int i=1; i<=this.economySeats.length / 7; i++)
			{
				for(int m=0; m<7; m++)
				{
					this.economySeats[j++] = new Seat(i +""+ (char)('A'+m));
				}
			}
		}
	}
	public void setBusinessClassCapacity(int capacity)
	{
		if((numBusinessClassPassenger == 0) && (capacity >=0 && capacity % 4 == 0))
		{
			this.businessClassCapacity = capacity;
			this.businessClassSeats = null;
			this.businessClassSeats = new Seat[businessClassCapacity];
			int j = 0;
			for(int k=1; k<=businessClassSeats.length / 4 ; k++)
			{
				for(int m=0; m<4; m++)
				{
					this.businessClassSeats[j++] = new Seat(k +""+ (char)('W'+m));
				}
			}
		}
	}
	public boolean bookPassenger(Passenger passenger, String seatName, BookingType type)
	{
		if(type == BookingType.BusinessClass)
		{
			for(Seat s :  businessClassSeats)
			{
				if(s.getName().equals(seatName))
				{
					s.setPassenger(passenger);
					numBusinessClassPassenger++;
					return true;
				}
			}
		}
		else
		{
			if(seatName.charAt(0) == '1' && !passenger.isPWD && numEconomyPassenger < economyCapacity-7)
				return false;	

			if(seatName.charAt(0) != '1' && !passenger.isPWD)
			{
				for(Seat s :  economySeats)
				{
					if(s.getName().equals(seatName))
					{
						s.setPassenger(passenger);
						numEconomyPassenger++;
						return true;
					}
				}
			}
			else if(passenger.isPWD && economyCapacity > numEconomyPassenger)
			{
				for(Seat s :  economySeats)
				{
					if(s.getName().equals(seatName))
					{
						s.setPassenger(passenger);
						numEconomyPassenger++;
						return true;
					}
				}
			}
			else if(!passenger.isPWD && economyCapacity > numEconomyPassenger)
			{
				for(Seat s :  economySeats)
				{
					if(s.getName().equals(seatName))
					{
						s.setPassenger(passenger);
						numEconomyPassenger++;
						return true;
					}
				}
			}
			return false;
		}
		return false;	
	}
	public ArrayList<Passenger> getAllEconomyPassengers()
	{
		ArrayList<Passenger> passengers = new ArrayList<>();
		for(Seat s : economySeats)
		{
			if(s.getPassenger() != null)
			{
				passengers.add(s.getPassenger());
			}
			else if(s.getPassenger() == null)
			{
				passengers.remove(s);
			}
		}
		return passengers;
	}
	public ArrayList<Passenger> getAllBusinessClassPassengers()
	{
		ArrayList<Passenger> passengers = new ArrayList<>();
		for(Seat s : businessClassSeats)
		{
			if(s.getPassenger() != null)
			{
				passengers.add(s.getPassenger());
			}
			else if(s.getPassenger() == null)
			{
				passengers.remove(s);
			}
		}
		return passengers;
	}
	@Override
	public String toString()
	{
		String result = this.name + "\n\n";
		int ctr = 0;

		if(this.numEconomyPassenger + this.numBusinessClassPassenger == this.economyCapacity + this.businessClassCapacity)
		{
			result += "Fully Booked.";
		}
		else
		{
			if(businessClassCapacity > 0)
			{
				for(Seat s : this.businessClassSeats)
				{
					result += s + " ";
					if(++ctr % 4 == 0)
						result += "\n";
				}
				result += "\n";
			}
			ctr = 0;
			for(Seat s :  this.economySeats)
			{
				result += s + "  ";
				if(ctr % 7== 1 || ctr % 7 == 4)
					result += " ";
				if(++ctr % 7 ==0)
					result += "\n";
			}
		}
		return result;
	}
}