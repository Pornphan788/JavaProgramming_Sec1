import java.io.*;
public class Lab1205 {

	public static void main(String[] args) throws IOException{
	Head();
	BufferedReader readFile = new BufferedReader(new FileReader("d://txtFile//student.txt"));
	String tmp ="";
	int i=1;
	while((tmp=readFile.readLine())!=null) 
		{
			String[] data = tmp.split(" ");
			char Fname = data[2].charAt(0);
			double grade = Double.parseDouble(data[4]);
			String Lname = data[3];
			String id = data[0];
			System.out.println(i+".\t"+data[0]+"\t"+Level(id)+"\t"+Fname+"."+Lname+"\t"
							+grade+"\t"+Status(grade));
			i++;
		}
	}//main
	public static String Level(String id) throws IOException {
		int year = 22-Integer.parseInt(id.substring(0,2));
		return year+"th";
	}//Level
	public static String Status(double gradee) {
		if(gradee>2.00) {
			return "Pass";
		}
		else if (gradee>=1.00&&gradee<=2.00) {
			return "Critical";
		}else return "retired";
	}
	public static void Head() 
	{
		System.out.println("No.\tID\t\tLevel\tName\t\tGrade\tStatus");
		System.out.println("****************************************************************");
	}

}
