import java.io.*;
import java.util.Scanner;

public class ATMChecking extends ATMData{
	private int money;
	
	public ATMChecking(String accountNumber,String password,int money) {
		super(accountNumber,password);
		this.money = money;
	}
	
	public boolean checkBookBank() throws IOException {
		Scanner in = new Scanner(new File("ATMBookBank.txt"));
		String account = in.next();
		String pass = in.next();
		int Bmoney = in.nextInt();
		if(getID().equals(account)&&getPass().equals(pass)&&Bmoney>=money) {
			return true;
		}else {
		return false;
		}
	}
	public void show() {
		int money1000 = money/1000;
		int money500 = (money-(money1000*1000))/500;
		int money100 = (money-(money1000*1000)-(money500*500))/100;
		System.out.print("You drawing for "+money+", get");
		System.out.println("\t1000 = "+money1000+"\n\t500 = "+money500+"\n\t100 = "+money100);
		System.out.print("You balance is "+money+"baht.");
	}
}
