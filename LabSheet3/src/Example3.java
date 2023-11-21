import javax.swing.*;
import java.text.*;
public class Example3 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat ("###.0");
		double Weight = Double.parseDouble(JOptionPane.showInputDialog("Input Weight:"));
		double Height = Double.parseDouble(JOptionPane.showInputDialog("Input Height:"));
		double height = Height/100;
		double BMI=Weight/(height*height);
		if(BMI<18.5) 
		{													    /* from C */
		JOptionPane.showMessageDialog(null,"BMI = "+String.format("%.1",BMI)+"\nYou're Underweight","BMI",JOptionPane.WARNING_MESSAGE);
		}//if
		else if(BMI>=18.5&&BMI<=24.9) 
		{
		JOptionPane.showMessageDialog(null,"BMI = "+String.format("%.1",BMI)+"\nYou're Normal-weight","BMI",JOptionPane.WARNING_MESSAGE);
		}//else if
		else if(BMI>=25.0&&BMI<=29.9) 
		{									       /*DecimalFormat Java*/
		JOptionPane.showMessageDialog(null,"BMI = "+frm.format(BMI)+"\nYou're Overweight","BMI",JOptionPane.WARNING_MESSAGE);
		}
		else 
		{
		JOptionPane.showMessageDialog(null,"BMI = "+frm.format(BMI)+"\nYou're Obesity","BMI",JOptionPane.WARNING_MESSAGE);
		}
	}
}
