import java.util.*;
public class Lab505 {

	public static void main(String[] args) {
		
		inputStudent();
		
	}//end of main()
	
	public static void inputStudent() {
		Scanner scan = new Scanner(System.in);
		String Id = "";
		String Subject="";
		do {
		System.out.print("Enter Student Id: ");
		Id = scan.nextLine();
		System.out.print("Enter Subject Id: ");
		Subject = scan.nextLine();
		}while(!(isLength(Id,Subject)));
	}//end of inputStudent()
	
	public static boolean isLength(String chkId,String chkSubject) {
		if(chkId.length() == 10 && chkSubject.length() == 7) {
			return true;
		}
		else {
			return false;
		}
		
	}

}
