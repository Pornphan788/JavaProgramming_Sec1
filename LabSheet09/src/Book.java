import java.time.Year;

public class Book {
	
	private String title;
	private float price;
	private int publishyear;
	//setTitle
	public void setTitle(String title) 
	{
		this.title=title;
	}
	//getTitle
	public String getTitle() 
	{
		return title;
	}
	//setPrice
	public void setPrice (float price) 
	{
		this.price=price;
	} 
	//getPrice
	public float getPrice() 
	{
		return price;
	}
	//setPublishyear
	public void setPublishyear(int publishyear) 
	{
		this.publishyear=publishyear;
	}
	//getPublishyear
	public int getPublishyear()
	{
		return publishyear;
	}
	//getTotalYear
	public int getTotalYear() 
	{
		return Year.now().getValue()-publishyear;
	}
	//toString
	public String toString() 
	{
		return "Title: "+title+"publishyear for "+getTotalYear()+"year ("+price+"bath).";
	}
}//endClass
