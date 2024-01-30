import javax.swing.*;
public class RectangleDemo1 {
	public static void main(String[] args) {
		/*double widthInput = Double.parseDouble(JOptionPane.showInputDialog("Input width"));
		double lengthInput = Double.parseDouble(JOptionPane.showInputDialog("Input length"));
		String colorinput = JOptionPane.showInputDialog("Input color");
		
		//object
		
		Rectangle obj1 = new Rectangle(widthInput,lengthInput,colorinput);
		
		JOptionPane.showMessageDialog(null, obj1.toString()
				 +"\nArea of Rectangle = "+obj1.getArea());*/
		
		double widthInput = Double.parseDouble(JOptionPane.showInputDialog("Input width"));
		double lengthInput = Double.parseDouble(JOptionPane.showInputDialog("Input lenght"));
		Rectangle2 obj2 = new Rectangle2(widthInput,lengthInput);
		JOptionPane.showMessageDialog(null, obj2.toString()+"\nArea of Rectangle = "+obj2.getArea());
	}
}
