import java.util.*;
public class Lab604 {

	static Scanner input = new Scanner(System.in);
	static String studentId,subId;
	static int subjeatId;
	static boolean stdIT,subIT;
	public static void main(String[] args) {

		inputStudent();
	}//end main
	
	public static void inputStudent() 
	{
		do {
			System.out.print("Enter Student Id: ");
			studentId = input.next();
			System.out.print("Enter Subjet Id: ");
			subjeatId = input.nextInt();
			subId = subjeatId+"";
		}
		while(!isLength(studentId,subId));
		System.out.println();
		
		displayData(isITStudent(studentId),isITSubject(subId));
		
	}//end inputStudent
	
	public static boolean isLength(String sid ,String subId) 
	{
		if(sid.length()==10&&subId.length()==7) 
		{
			return true;
		}
		else 
			return false;
	}//end isLength
	
	public static boolean isITStudent(String sid)
	{
		if(sid.substring(0,3).equals("211")&&sid.substring(3,6).equals("311")) 
		{
			return true;
		}
		else
			return false;
	}//end 
	
	public static boolean isITSubject(String subId)
	{
		if(subId.substring(0,2).equals("21")&&subId.substring(4,5).equals("1")) 
		{
			return true;
		}
		else
			return false;
	}//end 
	
	public static void displayData(boolean stdIT , boolean subIT) 
	{
		if(stdIT==true) 
		{
			System.out.print("Student id: "+studentId+" 1st year student in IT");
		}
		else 
			System.out.print("Student id: "+studentId+" is not 1st year student in IT");
		System.out.println();
		if(subIT==true) 
		{
			System.out.print("Enroll in course for year 1 ");
		}
		else
			System.out.print("not Enroll in course for year 1 ");
	}
	
	
	
	
}//end class
