import java.util.*;
import javax.swing.*;
import java.text.*;
public class Withdrawal {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat ("#,###");
		Random rand = new Random();
		int balance = rand.nextInt(9)*100000;
		int money = Integer.parseInt(JOptionPane.showInputDialog("Your balance : "+frm.format(balance)+
				"\nInput money to withdraw:"));
		int with = money%100;

		if(money>balance) 
		{
			JOptionPane.showMessageDialog(null,"Error: Cannot withdraw more than balance","ERROR",
					JOptionPane.ERROR_MESSAGE);
		}//end
		else if(money>20000) 
		{
			JOptionPane.showMessageDialog(null,"Error: Cannot withdraw more than 20,000","ERROR",
					JOptionPane.ERROR_MESSAGE);	
		}//end
		else if(with != 0)
		{
			JOptionPane.showMessageDialog(null,"Error: Cannot withdraw "+frm.format(with)+" baht.","ERROR",
					JOptionPane.ERROR_MESSAGE);	
		}//end
		else
		{
			JOptionPane.showMessageDialog(null,"You withdraw "+frm.format(money)+"\n1,000 = "+money/1000
					+"\n500 = "+((money%1000)/500)+"\n100 = "+(money%500)/100);
		}//end
		
	}

}
