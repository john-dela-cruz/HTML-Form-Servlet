package ph.edu.iacademy.model;

public class StudentBean {

	//input values
	private String name;
	private int quiz1;
	private int quiz2;
	
	//computed values
	private double average;
	private String message;
	
	public StudentBean() {
	}

	public StudentBean(String name, int quiz1, int quiz2) {
		this.name = name;
		this.quiz1 = quiz1;
		this.quiz2 = quiz2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuiz1() {
		return quiz1;
	}

	public void setQuiz1(int quiz1) {
		this.quiz1 = quiz1;
	}

	public int getQuiz2() {
		return quiz2;
	}

	public void setQuiz2(int quiz2) {
		this.quiz2 = quiz2;
	}

	public double getAverage() {
		return average;
	}

	public void setAverage(double average) {
		this.average = average;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void computeAverage() {
		this.average = (this.quiz1 + this.quiz2)/2;
	}
	
	public void determineMessage() {
		this.message = (this.average >= 69.5)
				? "Quiz average is passing grade."
				: "Quiz average is failing grade."; 
	}
}
