import java.text.*;
import java.util.Scanner;
final class IncomeTaxCalculator {

	public static void main(String[] args) {

		Scanner srn =new Scanner(System.in);
		DecimalFormat frm = new DecimalFormat ("#,###.00");
		// Declare constants first (variables may use these constants)
		final double TAX_RATE_ABOVE_20K = 0.1;
		final double TAX_RATE_ABOVE_40K = 0.2;
		final double TAX_RATE_ABOVE_60K = 0.3;
		// Declare variables
		double taxPayable;
		
		//Dummy
		System.out.print("Input your salary :");
		int taxableIncome = srn.nextInt();
		if(taxableIncome<=20000) 
		{
			taxPayable = 0;
		}//end
		else if (taxableIncome<=40000) 
		{
			taxPayable = (taxableIncome-2000)*TAX_RATE_ABOVE_20K;
		}//end
		else if (taxableIncome<=60000) 
		{
			taxPayable = 20000*TAX_RATE_ABOVE_20K+(taxableIncome-40000)*TAX_RATE_ABOVE_40K;
		}//end
		else 
		{
			taxPayable = (20000*TAX_RATE_ABOVE_20K)+(20000*TAX_RATE_ABOVE_40K)
						+(taxableIncome-60000)*TAX_RATE_ABOVE_60K;
		}//end
		
		//java
		System.out.print("The income tac payable is :"+frm.format(taxPayable));
		
		//C
		//System.out.printf("The income tax payable is : $.2f",taxPayable);
	}

}
