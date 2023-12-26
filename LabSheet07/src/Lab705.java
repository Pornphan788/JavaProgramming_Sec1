import javax.swing.*;
public class Lab705 {
 
	static String od="",ev="";
	
	public static void main(String[] args) {
		int[] nums = new int[5];
        for(int i=0;i<nums.length;i++) 
        {
        	nums[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter item number "+(i+1) + " : "));
        }//for
        ShowEven(nums);
        Showodd(nums);
  }
	public static void ShowEven(int[]nums) {
        for(int _nums:nums) 
        {
        	if(_nums %2==0)
        	{
        		ev+= _nums+" ";
        	}//if
        }	//for
        JOptionPane.showMessageDialog(null, "List of even number : \n"+ ev);
	}//even
	public static void Showodd (int[]nums) {
        for(int _nums:nums) 
        {
        	if(_nums %2==1) 
        {
        		od+= _nums+" ";
        }
        }
        JOptionPane.showMessageDialog(null, "List of odd number : \n"+ od);
    }//odd
}