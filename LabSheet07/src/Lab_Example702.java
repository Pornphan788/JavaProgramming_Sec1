import javax.swing.JOptionPane;
 
public class Lab_Example702 {
 
	public static void main(String[] args) {
 
		int[] validValues = {101,108,201,213,266,304,409,411,412};
		double[] price = {0.89,1.32,3.50,0.69,5.79,3.19,0.99,0.89,1.26,8.00};
		double itemPrice = 0.0;
		boolean validItem = false;
		int itemOrder = Integer.parseInt(JOptionPane.showInputDialog("Enter item to order"));
		for(int i = 0;i<validValues.length;i++ ) 
		{
			if(itemOrder == validValues[i]) 
			{
				validItem = true;
				itemPrice = price[i];
			}//if
		}//for find data
		if(validItem==true) 
		{
			System.out.print("Item"+itemOrder+"is"+itemPrice);
		}
		else 
		{
			System.out.print("Invalid Item");
		}
	}
 
}