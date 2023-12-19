import java.util.*;
public class Lab501 {

	public static void main(String[] args) {
		

		Scanner scr = new Scanner(System.in);
		System.out.print("Full Name: ");
		String name = scr.nextLine();
		
		int space = name.trim().indexOf(" ");
		if(space==-1) 
		{
			System.out.print("incorrect Name");
		}
		else 
		{
			System.out.print("First Name: "+name.substring(0,space)
							+"\nLast Name: "+name.substring(space));
		}
	}

}
		