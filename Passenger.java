public class Passenger
{
	private String name;
	public boolean isPWD;

	public Passenger(String name, boolean isPWD)
	{
		this.name = name;
		this.isPWD = isPWD;	
	}
	public String getName()
	{
		return this.name;
	}
	@Override
	public boolean equals(Object obj)
	{
		return (obj instanceof Passenger) ? (((Passenger)obj).getName().equals(this.name)) : false;
		/*
		if(obj instanceof Passenger)
		{
			if(((Passenger)obj).getName().equals(this.name))
				return true;
		}
		return false;*/
	}
	@Override
	public String toString()
	{
		return this.name + ((this.isPWD)? " [P]":"") + "\n";
	}


}