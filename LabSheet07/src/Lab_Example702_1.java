import javax.swing.JOptionPane;
 
public class Lab_Example702_1
{
 
	static int[] validValues = { 101, 108, 201, 213, 266, 304, 311, 409, 411, 412 };
	static double[] price = { 0.89, 1.23, 3.50, 0.69, 5.79, 3.19, 0.99, 0.89, 1.26, 8.00 };
	static double itemPrice = 0.0; //get price
	static boolean validItem = false; //check found or not
	public static void main(String[] args)
	{	
		inputItem();
	}//main
	
	public static void inputItem()
	{
		int itemOrder = Integer.parseInt(JOptionPane.showInputDialog("Enter item number yo order"));
		
		if(validItem == true)
		{
			System.out.print("Item " + itemOrder + " is " + itemPrice);
		}
		else
		{
			System.out.print("Invalid Item");
		}
	}//input
	public static boolean checkItem(int item) 
	{
		for(int i = 0;i<validValues.length;i++ ) 
		{
			if(item == validValues[i]) 
			{
				validItem = true;
				itemPrice = price[i];
			}//if
		}//for find data
		return validItem;
	}
 
}