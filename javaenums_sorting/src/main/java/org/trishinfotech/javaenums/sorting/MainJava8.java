package org.trishinfotech.javaenums.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainJava8 {
	public static void main(String[] args) {
		// preparing some hard-coded data to keep code simple and focused.
		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(101, "Vijay", 24));
		studentList.add(new Student(109, "Ajay", 27));
		studentList.add(new Student(108, "Jai", 24));
		studentList.add(new Student(106, "Ajay", 23));
		studentList.add(new Student(104, "Jai", 26));
		studentList.add(new Student(103, "Vijay", 23));
		studentList.add(new Student(105, "Jai", 21));
		System.out.println("Sorting by Name...");
		Collections.sort(studentList, Comparator.comparing(Student::getName));
		printStudentList(studentList);
		System.out.println("Sorting by Name and age (both ascending)...");
		Collections.sort(studentList, Comparator.comparing(Student::getName).thenComparing(Student::getAge));
		printStudentList(studentList);
		System.out.println("Sorting by Name and age (desc) and rollno...");
		Collections.sort(studentList, Comparator.comparing(Student::getName).thenComparing(Student::getAge).reversed()
				.thenComparing(Student::getRollno));
		printStudentList(studentList);
		System.out.println("sorting by age...");
		Collections.sort(studentList, Comparator.comparing(Student::getAge));
		printStudentList(studentList);
		System.out.println("sorting by rollno in descending order...");
		Collections.sort(studentList, Comparator.comparing(Student::getRollno).reversed());
		printStudentList(studentList);
	}

	private static void printStudentList(ArrayList<Student> studentList) {
		studentList.stream().forEach(System.out::println);
	}
}