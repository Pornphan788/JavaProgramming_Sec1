import javax.swing.*;

public class Lab601 {

	public static void main(String[] args) {
		inputEmail();
	}
	
	public static void  inputEmail() 
	{
		//input
	String inputEmail = JOptionPane.showInputDialog("Input your e-mail:").toLowerCase();
	
		//check @  " "
	while(inputEmail.startsWith("@")||inputEmail.startsWith(" ")) 
	{
		inputEmail = JOptionPane.showInputDialog("Input your e-mail,again :");
	}//end
		
	
		//check
	boolean validateEmail = checkEmail(inputEmail);
	
	if(validateEmail) 
	{
		JOptionPane.showMessageDialog(null, "Your e-mail is "+inputEmail);
	}
	else
		JOptionPane.showMessageDialog(null, "Yuor e-mail is not hotmail or gmail dot com ");
	}//end main
	
	
	public static boolean checkEmail(String email) {
		if(email.endsWith("hotmail.com")||email.endsWith("gmail.com")) 
		{
			return true;
		}
		else
		return false;
	}//end check

}
