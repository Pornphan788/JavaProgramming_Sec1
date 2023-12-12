import javax.swing.JOptionPane;
public class Eample_502 {

	public static void main(String[] args) {

		//input
		String yourEmail = JOptionPane.showInputDialog("Input your e-mail:");
		//check
		while(yourEmail.startsWith("@")||yourEmail.startsWith(" ")) 
		{
			yourEmail = JOptionPane.showInputDialog("Input your e-mail,again :");
		}//end
		
		yourEmail = yourEmail.toLowerCase();
		
		if(yourEmail.endsWith("hotmail.com")||yourEmail.endsWith("gmail.com")) 
		{
			JOptionPane.showMessageDialog(null, "Your e-mail is "+yourEmail);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Your e-mail is not hotmail or gmail dot com");
		}
	}

}
