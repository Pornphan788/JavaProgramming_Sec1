import java.io.*;
import java.util.*;
public class Example1203 {
	public static void main(String[] args) throws IOException{
		Scanner scr = new Scanner(System.in);
		System.out.print("Input Section: ");
		int section = scr.nextInt();
		Header(section);
		showListStudent(section);
	}//main
	
	
	public static void showListStudent(int sectionInput) throws IOException {
		BufferedReader readFile = new BufferedReader(new FileReader("d://txtFile//List107.txt"));
		String tmp ="";
		while((tmp=readFile.readLine())!=null) 
		{
			String[] data = tmp.split("\t");
			double midtemScore = Double.parseDouble(data[4]);
			double finaltemScore = Double.parseDouble(data[5]);
			int sectionFile = Integer.parseInt(data[3]);
			if(sectionFile==sectionInput) 
			{
				System.out.println(data[0]+"\t"+data[2]+"\t"+midtemScore+"\t"+finaltemScore
								  +"\t"+findResult(midtemScore,finaltemScore));
			}
		}
	}//showListStudent
	public static String findResult(double midtem,double finalscore) {
		double totalScore = midtem+finalscore;
		if(totalScore<=40) 
			{
			return "Fail";
			}
		else return "Pass";
		
	}//findResult
	public static void Header(int sec) {
		System.out.println("*********************************************");
		System.out.println("\tList of Data for Section");
		System.out.println("*********************************************");
	}//Header
	
}
