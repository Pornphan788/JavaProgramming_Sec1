import java.io.*;
public class Lab1203 {

	public static void main(String[] args) throws IOException{

			//read file by BufferReader
			BufferedReader readFile = new BufferedReader(new FileReader("d://txtFile//Bookdata.txt"));
			String tmp = "";
			int countBook=0 , i=1;
			while((tmp=readFile.readLine())!=null) 
			{
				String[] data = tmp.split("\t");
				System.out.println(i+"."+data[0]+"("+data[1]+"), Rating"+data[2]+"publish on "+data[5]);
				countBook++;
				i++;
			}
			System.out.println("===========================");
			System.out.println("Total bool = "+countBook);
			readFile.close();
			

	}

}
