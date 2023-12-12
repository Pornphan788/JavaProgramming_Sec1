import javax.swing.*;
public class Example_503_1 {

	public static void main(String[] args) {

		String Sentence = JOptionPane.showInputDialog("Input sentence:");
		while(!Sentence.endsWith(".")) 
		{
			Sentence = JOptionPane.showInputDialog("Input sentence, again:");
		}
		int spacebar = 0;
		
		for(int i=0;i<Sentence.length();i++) 
		{
			if(Sentence.charAt(i)==' ') 
			{
				spacebar++;
			}//end if
			
		}//end for
		JOptionPane.showMessageDialog(null, "This sentence has"+spacebar+"spacebar"+
									 		"\nThis sentence has"+(spacebar+1)+"word");

	}

}
