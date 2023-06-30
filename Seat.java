public class Seat
{
	private String name;
	private Passenger passenger;

	public Seat(String name)
	{
		this.name = name;
		this.passenger = null;
	}
	public String getName()
	{
		return this.name;
	}
	public boolean isAvailable()
	{
		return passenger == null;
	}
	public boolean setPassenger(Passenger passenger)
	{
		if(isAvailable())
		{
			this.passenger = passenger;
			return true;
		}
		return false;
	}
	public Passenger getPassenger()
	{
		return this.passenger;
	}
	@Override
	public String toString()
	{
		return "[" +(this.isAvailable()? this.name:"XX")+"]";
	}
}