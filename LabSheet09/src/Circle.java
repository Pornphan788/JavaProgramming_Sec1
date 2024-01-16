
public class Circle {
	
	public static final double DEFAULT_RADIUS = 1.0;
	public static final String DEFAULT_COLOR = "red";
	
	private double  radius = 1.0;
	private String color = "red";
	
	//default constructor
	
	Circle()
	{
		radius = DEFAULT_RADIUS;
		color = DEFAULT_COLOR;
	}
	//constructor with parameter radius
	Circle(Double radius)
	{
		this.radius = radius;
		this.color = DEFAULT_COLOR;
	}
	//constructor with parameter radius n color
	Circle(Double radius , String color)
	{
		this.radius = radius;
		this.color = color;
	}
	//getRadius
	public double getRadius () 
	{
		return radius;
	}
	//setRadius
	public void setRadius (double radius) 
	{
		this.radius = radius;
	}
	//getColor
	public String getColor() 
	{
		return color;
	}
	//setColor
	public void setColor(String color) 
	{
		this.color = color;
	}
	//toString
	public String toString() 
	{
		return "Circle[radius = "+radius+",color="+color+"]";
	}
	//getArea
	public double getArea() 
	{
		return radius*radius*Math.PI;
	}
	//Return the Circumference of this Circle
	public double getCircumference() 
	{
		return 2.0*Math.PI*radius;
	}
	
}
