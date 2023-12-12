import java.util.*;
public class Example_503 {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		System.out.print("input a sentence: ");
		String Sentence = scr.nextLine();
		while(!Sentence.endsWith(".")) 
		{
			System.out.print("input a sentence,again: ");
			Sentence = scr.nextLine();
		}
		
		System.out.println();
		//count
		int spacebar = 0;
		
		for(int i=0;i<Sentence.length();i++) 
		{
			if(Sentence.charAt(i)==' ') 
			{
				spacebar++;
			}//end if
			
		}//end for
		System.out.print("This sentence has"+spacebar+"spacebar");
		System.out.print("\nThis sentence has"+(spacebar+1)+"word");

	}

}
