package addressbook_231222;

public class Student {
	private String name;
	private int korean;
	private int math;
	private int english;
	private double avg;


	Student(String name, int korean, int math, int english){
	this.name=name;
	this.korean=korean;
	this.math=math;
	this.english=english;
	}
	
	double avg1=(korean+math+english)/3;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKorean() {
		return korean;
	}
	public void setKorean(int korean) {
		this.korean = korean;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}

	
}
