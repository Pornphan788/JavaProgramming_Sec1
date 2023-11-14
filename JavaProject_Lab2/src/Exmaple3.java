import java.util.*;
import java.text.*;

public class Exmaple3 {

	public static void main(String[] args) {
		
		DecimalFormat frm = new DecimalFormat ("#,###.00");
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input product name   : ");
		String productName = input.nextLine(); 
		System.out.print("Input product unit   : ");
		int productUnit = input.nextInt();
		System.out.print("input price per unit : ");
		float priceperunit = input.nextFloat();
		System.out.println();
		
		float  totalprice = productUnit*priceperunit;
		System.out.println("Total Price is "+frm.format(totalprice)+" bath.");
		float Vat = totalprice + (totalprice*7/100);
		System.out.print("Add VAT 7%  is "+frm.format(Vat)+ " bath.");
		
	}

}
