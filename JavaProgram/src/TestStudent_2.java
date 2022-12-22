import java.util.*;
public class TestStudent_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("How many student in classroom: ");
		Student[] std = new Student[scan.nextInt()];
		System.out.println();
		for(int i=0;i<std.length;i++) { //Array Object
			std[i] = new Student(); // กำหนดค่าของ array ให้เรียกใช้เมธอดในคลาสต้นแบบ
			System.out.print("Input student name: ");
			std[i].setName(scan.next());
			System.out.print("Input student score:");
			std[i].setScore(scan.nextInt());
			System.out.println("----------------------------------------------------------");
			while(!std[i].checkScore()) {
				System.out.print("Input student score,again: ");
				std[i].setScore(scan.nextInt());	
			}//end while()
		}//end for
		for(Student _std:std) {
				System.out.println(">> "+_std.getName()+" get grade "+_std.findGrade(_std.getScore()));
		}
	}
	
}
