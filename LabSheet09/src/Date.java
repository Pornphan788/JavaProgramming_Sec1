
public class Date {

	private int year,month,day;
	//Date
	public Date (int year, int month ,int day) 
	{
		this.year = year;
		this.month = month;
		this.day = day;
	}
	//getYear
	public int getYear () 
	{
		return this.year;
	}
	//getMonth
	public int getMonth () 
	{
		return this.month;
	}
	//getDay
	public int getDay() 
	{
		return this.day;
	}
	//setYear
	public void setYear(int year) 
	{
		this.year=year;
	}
	//setMonth
	public void setMonth(int month)
	{
		this.month = month;
	}
	//setDay
	public void setDay(int day)
	{
		this.day=day;
	}
	//toString
	public String toString() 
	{
		return String.format("%02d/%02d/%4d",month,day,year);
	}
	public void setDate(int year, int month, int day) 
	{
		this.year=year;
		this.month=month;
		this.day=day;
	}
}
