import java.util.*;
import java.io.*;
public class SentenceText {

	public static void main(String[] args) throws IOException {
		
		//create file write over
		
		PrintStream writeFile = new PrintStream((new File("d://txtFile///sentence.txt")));
		
		//input
		
		Scanner input = new Scanner(System.in);
		
		//pro
		int i=1;
		while(true) {
			System.out.print("Sentence: ");
			String word = input.next();
			//break
			if(word.equalsIgnoreCase("stop")) {
				break;
			}
			//save
			//writeFile.println(word);
			writeFile.println(i+": "+word);
			i++;
		}

		System.out.println("File is save!!");
		writeFile.close();

	}

}
