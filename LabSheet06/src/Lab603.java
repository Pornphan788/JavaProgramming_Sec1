import java.util.*;

public class Lab603 {

	static Scanner srn = new Scanner(System.in);
	public static void main(String[] args) {

		System.out.print("Please enter your name, separated by a space\n:");
		String fullname = srn.next();
		abbreviatName(fullname);
	}//end main
	
	public static String abbreviatName(String fullname) 
	{
		for(int i=0;i<fullname.length();i++) 
		{
			if(fullname.charAt(i) == ' ') 
			{
				System.out.println();
			}else
			System.out.print(fullname.charAt(i));
		}
		return fullname;
	}//end abbreviatName

}
