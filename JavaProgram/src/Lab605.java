import javax.swing.*;
public class Lab605 {

	public static void main(String[] args) {
		int[] number = new int[5];
		for(int i = 0;i<number.length;i++) {
			number[i] = Integer.parseInt(JOptionPane.showInputDialog("Input number "+(i+1)));
		}
		showEven(number);
		showOdd(number);
		
	}// end of main()
	
	public static void showEven(int[] nums) {
		String Evennums = "";
		for(int _nums: nums) {
			if(_nums % 2 ==0) {
				Evennums = Evennums+_nums+" " ;
			}
		}
		JOptionPane.showMessageDialog(null, 
				"List of Even Number:\n "+Evennums );

	}// end of showEven()
	
	public static void showOdd(int[] nums) {
		String Oddnums = "";
		for(int _nums: nums) {
			if(_nums % 2 !=0) {
				Oddnums = Oddnums+_nums+" " ;
			}
		}
		JOptionPane.showMessageDialog(null, 
				"List of Even Number:\n "+Oddnums );
	}//end of showOdd

}
