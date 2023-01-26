import javax.swing.*;
public class BookDemo2 {
	public static void main(String[] arg) {
	String name = JOptionPane.showInputDialog("Input author name: ");
	String email = JOptionPane.showInputDialog("Input author e-mail: ");
	String title = JOptionPane.showInputDialog("Input book title: ");
	int page = Integer.parseInt(JOptionPane.showInputDialog("Input book page: "));
	Book1 book = new Book1(title,new Author1(name,email),page);
	int check = JOptionPane.showConfirmDialog(null,"Is the page correct",
			"Confirm",
			JOptionPane.YES_NO_OPTION);
	while(check!=0) {
		page = Integer.parseInt(JOptionPane.showInputDialog("Input book page,again: "));
		book.setPage(page);
	}
	JOptionPane.showMessageDialog(null, "Book Title :"+book.getTitle()+
			"\nAuthor name : "+name+" ("+book.getPage()+" page)"+
			"\nAuthor e-mail:"+email);
	
	}
}
