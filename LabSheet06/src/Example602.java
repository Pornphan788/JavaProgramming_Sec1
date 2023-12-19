import javax.swing.JOptionPane;

public class Example602 {

	public static void main(String[] args) {
		int inputyear = Integer.parseInt(JOptionPane.showInputDialog("Input year: "));
		
		while(!checkYear(inputyear))
		{
			inputyear = Integer.parseInt(JOptionPane.showInputDialog("Please input year betweem 1000-3000, \nInput year again "));
		}
		/*if(isleapYear(inputyear)==true) 
		{
			JOptionPane.showMessageDialog(null,inputyear+" is Leap Year");
		}else
			JOptionPane.showMessageDialog(null, inputyear+" is not Leap Year");*/
		
		//conditional OP
		
		JOptionPane.showMessageDialog(null, isleapYear(inputyear)?inputyear+" is Leap Year": inputyear+" is not Leap Year");
	
	}//end main
	
	public static boolean isleapYear (int year) 
	{
		if((year%4==0)&&(year%100!=0)||(year%400==0)) 
		{
			return true;
		}else
			return false;
		
	}//end isleapYear
	
	public static boolean checkYear (int year) 
	{
		if(year>=1000&&year<=3000)
		{
			return true;
		}		
		else
			return false;
	}//end checkYear

}
