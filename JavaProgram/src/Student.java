
public class Student {
	private String name;
	private int score;
	//method
	public void setName(String Name) {
		name = Name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setScore(int Score) {
		score = Score;
	}
	
	public int getScore() {
		return score;
	}
	public boolean checkScore() {
		return (score>=0&&score<=100?true:false);
	}
	
	public boolean isPass() {
		return (score>=50?true:false);
	}
	
	public String findGrade(int score) {
		return (score <=100&&score >=80?"A":score <=79&&score>=75?"B+":score <=74&&score>=70?"B":score <=69&&score>=65?"C+":
			score <=59&&score>=55?"D+":score <=54&&score>=50?"D":"F");
	}
}
