
public class Person {
	private String firstName;
	private String lastName;
	
	//Default Constractor
	public Person() {
		firstName = "";
		lastName = "";
	}
	
	//Constructor with parameters
	public Person(String first,String last) {
		setName(first,last);
	}
	
	public String toString() {
		return firstName+" "+lastName;
	}
	
	public void setName(String first,String last) {
		firstName = first;
		lastName = last;
	}
	
	//Method to return firstName
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
}
