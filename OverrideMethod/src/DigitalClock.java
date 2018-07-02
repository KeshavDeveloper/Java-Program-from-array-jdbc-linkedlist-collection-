
public class DigitalClock extends Clock
{
	protected int NumberOfSecond=42;
	public String toString()
	{
		return Integer.toString(NumberOfSecond);
	}
	public static void main(String[] args) 
	{
		Clock childclock=new DigitalClock();
		childclock.numberOfsecond=50;
		System.out.println(childclock.numberOfsecond);
		
	}

}
