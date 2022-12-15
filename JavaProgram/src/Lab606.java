import javax.swing.*;
public class Lab606 {

	public static void main(String[] args) {
		int[] nums = {25, 78, 41, 22, 36, 85,37};
		int IndexOfArray = Integer.parseInt(JOptionPane.showInputDialog("Input index of arrey : "));
		while(!checkIndex(nums,IndexOfArray)) {
			IndexOfArray=Integer.parseInt(JOptionPane.showInputDialog("Input index of arrey,again : "));
		}
		JOptionPane.showMessageDialog(null, 
				"Current data,num["+ IndexOfArray +"] is "+currentData(nums,IndexOfArray)
				+"\n"+(IndexOfArray-1!=-1?"Previous data,num["+ (IndexOfArray-1) +"] is "+ prevData(nums,IndexOfArray):"No privious data")
				+"\n"+(IndexOfArray+1!=-1?"Next data,num["+ (IndexOfArray+1) +"] is "+ nextData(nums,IndexOfArray):"No next data"));
	}// end of main()
	
	public static boolean checkIndex(int[] nums,int index) {
		return (index >=0&& index <=6);
	}// end of checkIndex()
	
	public static int currentData(int[] nums,int index){
		return nums[index];
	}// end of currentData()
	
	public static int prevData(int[] nums,int index){
		return (index >=0&& index <=6) ? nums[index -1]:-1;
	}// end of prevData()
	
	public static int nextData(int[] nums,int index){
		return (index >=0&& index <=6) ? nums[index +1]:-1;
	}// end of nextData()
}
