import java.io.*;
import java.util.*;

public class EmployeeInfo {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		String choice,department;
		
		System.out.print("Insert or Read Data? : ");
		choice = input.next().toLowerCase();
		
		while(!(choice.equals("insert"))&&!(choice.equals("read"))) {
			System.out.print("Please type insert or Read Data? : ");
			choice = input.next().toLowerCase();
		}
		SaveandOpen obj = new SaveandOpen();
		if(choice.equals("insert")) 
		{
			obj.insert();
		}
		else if (choice.equals("read"))
		{
			System.out.print("\nEnter dept: ");
			department = input.next();
			obj.setDept(department);
			obj.read();//call method read from SaveandOpen 
		}
	}
}
