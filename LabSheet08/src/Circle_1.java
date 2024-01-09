
public class Circle_1 {
		
		private  double radius;
		private  String color;
		
		public void setRadius(double ra) 
		{
			radius = ra;
		}//setRa
		
		public void setColor(String co) 
		{
			color = co;
		}//setco
		
		public String getColor() 
		{
			return color;
		}//getco
		
		public double getArea() 
		{
			return Math.PI*radius*radius;
		}//getar
		
		
}
