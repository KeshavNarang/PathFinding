public class Thermostat
{
	public static void main (String [] args)
	{
		Thermo t = new Thermo (0, 100);
		t.setTemp(50);
		t.setTemp(150);
		t.setTemp(-50);
	}
}
class Thermo 
{
	private int low, high;
	public Thermo (int low, int high)
	{
		this.low = low;
		this.high = high;
	}
	public void setTemp (int temp)
	{
		if (temp < this.low)
		{
			try
			{
				throw new Exception("Your temperature was out of bounds. Your temperature was too low.");
			}
			catch (Exception e)
			{
				System.out.println("An error was thrown");
			}
		}
		else if (temp > this.high)
		{
			try
			{
				throw new Exception("Your temperature was out of bounds. Your temperature was too high");
			}
			catch (Exception e)
			{
				System.out.println("An error was thrown");
			}
		}
	}
}
