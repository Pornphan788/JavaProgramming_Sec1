import java.text.DecimalFormat;
import javax.swing.*;
public class Example1 {

	public static void main(String[] args) {
		
		DecimalFormat frm = new DecimalFormat ("#,###.00");
		final double BUFFET = 299;
		int numberofCustomer = Integer.parseInt(JOptionPane.showInputDialog("How many customer per bill?"));
		
		double totalPrice = BUFFET*numberofCustomer ;
		double discount = totalPrice - (totalPrice*10/100);
		int member;
		do {
		member = JOptionPane.showConfirmDialog(null, "Total price is "+ frm.format(totalPrice)+" baht."+"\nDo you have a member card?");
		
		if(member ==JOptionPane.YES_OPTION) 
		{
			JOptionPane.showMessageDialog(null,"Amount to be paid is"+frm.format(discount)+" baht.");
		}
		else if (member == JOptionPane.NO_OPTION) 
		{
			JOptionPane.showMessageDialog(null, "Amount to be paid is "+frm.format(totalPrice));
		}
		}while(member == JOptionPane.CANCEL_OPTION);




	}

}
