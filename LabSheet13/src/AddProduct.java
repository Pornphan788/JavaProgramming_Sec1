import java.io.*;
import java.util.*;
public class AddProduct {

	public static void main(String[] args) throws IOException {
		
		Scanner input = new Scanner(System.in);
		
		//create file not over write
		
		FileWriter filename = new FileWriter("d://txtFile//product.txt",true);
		PrintWriter writeFile = new PrintWriter(filename);
		
		System.out.print("Product Id: ");
		String id = input.next();
		System.out.print("Product Name: ");
		String name = input.next();
		System.out.print("Product Unit: ");
		int Unit = input.nextInt();
		System.out.print("Product Unit: ");
		float price = input.nextFloat();
		
		//save
		
		writeFile.println(id+","+name+","+Unit+","+price);
		System.out.print("Write file already...");
		writeFile.close();
		
	}

}
