import java.util.*;
import java.io.*;
public class Example1201 {

	public static void main(String[] args) throws IOException {

		//read file by Scanner
		
		Scanner scr = new Scanner(new File("d://txtFile//MemberLogin.txt"));
		while (scr.hasNext()) 
		{
			String fname = scr.next();//first name
			scr.next();//last name
			scr.next();
			String email = scr.next().toUpperCase();
			System.out.println(fname+" "+"("+email +")");
		}
		scr.close();
	}

}
