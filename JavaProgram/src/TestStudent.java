import java.util.*;
public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Student[] std = new Student[3];
		for(int i=0;i<std.length;i++) { //Array Object
			std[i] = new Student(); // ��˹���Ңͧ array ������¡�����ʹ㹤��ʵ�Ẻ
			System.out.println("INPUT INFORMATION OF STUDENT "+(i+1));
			System.out.println("----------------------------------------------------------");
			System.out.print("Input student name: ");
			std[i].setName(scan.next());
			System.out.print("Input student score:");
			std[i].setScore(scan.nextInt());
			while(!std[i].checkScore()) {
				System.out.print("Input student score,again: ");
				std[i].setScore(scan.nextInt());	
			}//end while()
			System.out.println();
		}//end for
		System.out.println();
		System.out.println("LIST OF PASS STUDENT (>=50)");
		System.out.println("----------------------------------------------------------");
		for(int i=0;i<std.length;i++) {
			if(std[i].isPass()) {
				System.out.print(">> "+std[i].getName()+" "+" ("+std[i].getScore()+" )");
			}
		}
	}

}
