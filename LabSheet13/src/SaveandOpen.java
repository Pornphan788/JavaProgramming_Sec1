import java.io.*;
import java.util.*;
public class SaveandOpen extends Employee{
	private String name;
	private String dept;
	String anaswer;
	
	public void insert() throws IOException {
		Scanner input = new Scanner (System.in);

		PrintStream writeFile = new PrintStream((new File ("d://txtFile//employee.txt")));
		do {
		header();
		System.out.print("Enter name: ");
		name = input.next();
		System.out.print("Enter department: ");
		dept = input.next();
		writeFile.println(name+"\t"+dept);//save file
		System.out.print("Enter data again?: ");
		anaswer = input.next();
		}while(anaswer.equalsIgnoreCase("y"));
		writeFile.close();
	}
	
	public void read() {	
		try {
			Scanner readFile = new Scanner(new File("d://txtFile//employee.txt"));
			boolean check = false;
			header();
			int i = 1 ,k = 0;
			while(readFile.hasNext()) {
				name = readFile.next();
				dept = readFile.next();
				if(dept.equalsIgnoreCase(super.getDept())) {
					System.out.println(i++ +")"+name);
					k++;
					check = true;
				}
			}
			header();
			System.out.println("Employee in dept "+super.getDept()+" is "+ k +" person.");
		
			if(check==false) {

				System.out.print("\nSorry, no department: "+super.getDept()+" in file.");
			}
		}
		catch(IOException e) {
			System.out.println("Sorry, file not found");
		}
	}
	
}
