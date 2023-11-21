import java.util.*;
import java.text.*;
public class Lab101 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		DecimalFormat frm = new DecimalFormat ("#,###.00");
		
		System.out.print("Input Product Name   : ");
		String productName = input.nextLine(); 
		System.out.print("Input Product Unit   : ");
		int productUnit = input.nextInt();
		System.out.print("input Price per unit : ");
		float priceperunit = input.nextFloat();
		System.out.println("-----------------------------------");
		
		float  totalprice = productUnit*priceperunit;
		System.out.println("Total Pice is "+frm.format(totalprice)+" baht.");
		System.out.println("-----------------------------------");
		System.out.print("How many discount (%) : ");
		float discount = input.nextFloat();
		float discountf = totalprice+(totalprice*discount/100);
		System.out.println("-----------------------------------");
		System.out.println("Discount from"+discount+"%"+"\t"+discountf);
	}

}
