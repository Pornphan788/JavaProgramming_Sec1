import java.text.DecimalFormat;

public class TestCircle {

	public static void main(String[] args) {
		
		DecimalFormat fomat = new DecimalFormat("");
		
		Circle_1 c1 = new Circle_1();
		Circle_1 c2 = new Circle_1();
		Circle_1 c3 = new Circle_1();
		
		c1.setRadius(2.0);
		c1.setColor("blue");
		System.out.println("Circle area of object c1 is "+c1.getArea());
		System.out.println(", and color is "+c1.getColor());
		System.out.println("");
		c2.setRadius(2.0);
		c2.setColor("red");
		System.out.println("Circle area of object c2 is "+c2.getArea()+"\n, and color is "+c2.getColor());
		System.out.println("");
		c3.setRadius(1.0);
		c3.setColor("red");
		System.out.println("Circle area of object c3 is "+c3.getArea()+"\n, and color is "+c3.getColor());
	}//main
	
	public static String showColor(String color) 
	{
		return "The color is "+color;
	}//showColor

}
