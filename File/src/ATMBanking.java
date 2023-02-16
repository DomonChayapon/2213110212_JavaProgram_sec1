import java.util.*;
import java.text.*;
public class ATMBanking {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter account number : ");
		String accountnumber = scan.next();
		while(accountnumber.length() != 14) {
			System.out.print("Enter account number : ");
			accountnumber = scan.next();
		}
		System.out.print("Enter password : ");
		String password = scan.next();
		while(password.length() != 4) {
			System.out.print("Enter password : ");
			password = scan.next();
		}
		System.out.print("Enter money : ");
		int money = scan.nextInt();
		while(money <=0) {
			System.out.print("Enter money : ");
			money = scan.nextInt();
		}
		ATMChecking bank = new ATMChecking(accountnumber,password,money);
		bank.show();
	}

}
