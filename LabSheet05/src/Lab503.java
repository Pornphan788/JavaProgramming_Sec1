import java.util.*;
public class Lab503 {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		System.out.print("Message : ");
		String mes = scr.nextLine();
		String msg = mes.equalsIgnoreCase("nichi");
		String text = "";
		int count=0;
		
		if(mes.indexOf("nichi")>=0) 
		{
			count++;
		}
		if(count == 0) 
		{
			System.out.print(mes);
		}
		else
		{
			System.out.print("Nichi is a sentence");
		}
	}
}
