
public class Date {
	private int dMonth;
	private int dDay;
	private int dYear;
	
	//the instance variables dMonth,dDay,and dYear are set to the default value
	public Date() {
		dMonth =1;
		dDay = 1;
		dYear = 1900;
	}
	
	//Constructor to set the date
	public Date(int month,int day,int year) {
		dMonth = month;
		dDay = day;
		dYear = year;
	}
	
	//Method to set the date
	public void setDate(int month,int day,int year) {
		dMonth = month;
		dDay = day;
		dYear = year;
	}
	
	//Method to return the month
	public int getMonth() {
		return dMonth;
	}
	
	public int getDay() {
		return dDay;
	}
	
	public int getYear() {
		return dYear;
	}
	
	public String toString() {
		return getMonth()+"-"+getDay()+"-"+getYear();
	}
}
