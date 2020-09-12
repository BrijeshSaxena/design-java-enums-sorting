package org.trishinfotech.javaenums.sorting;

public class Student {
	private int rollno;
	private String name;
	private int age;
	private int marks;

	public Student() {
		super();
	}

	public Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	
	public Student(int rollno, String name, int age, int marks) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public boolean getResult() {
		// return true if pass (more than 50 marks)
		return (marks > 50);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [rollno=").append(rollno).append(", name=").append(name).append(", age=").append(age)
				.append(", marks=").append(marks).append(", result=").append((getResult() ? "Pass" : "Fail"))
				.append("]");
		return builder.toString();
	}
}
