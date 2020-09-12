package org.trishinfotech.javaenums.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class MainResult {
	public static void main(String[] args) {
		// preparing some hard-coded data to keep code simple and focused.
		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(101, "Vijay", 24, 98));
		studentList.add(new Student(109, "Ajay", 27, 86));
		studentList.add(new Student(108, "Jai", 26, 49));
		studentList.add(new Student(106, "Ajay", 23, 45));
		studentList.add(new Student(104, "Jai", 26, 62));
		studentList.add(new Student(103, "Vijay", 23, 98));
		studentList.add(new Student(105, "Jai", 21, 54));
		System.out.println("Sorting by Name...");
		// SortingFieldsOrderBean order = new SortingFieldsOrderBean();
		// order.addField(SortingField.NAME);
		// Or in short because of chaining based implementation of addField method by
		// returning current object (return this)
		SortingFieldsOrderBean order = new SortingFieldsOrderBean().addField(SortingField.NAME);
		Collections.sort(studentList, new StudentResultComparator(order));
		printStudentList(studentList);
		System.out.println("Sorting by Name and age (both ascending)...");
		order = new SortingFieldsOrderBean().addField(SortingField.NAME).addField(SortingField.AGE);
		Collections.sort(studentList, new StudentResultComparator(order));
		printStudentList(studentList);
		System.out.println("Sorting by Name and age (desc) and rollno...");
		order = new SortingFieldsOrderBean().addField(SortingField.NAME).addField(SortingField.AGE, SortingOrder.DESC)
				.addField(SortingField.ROLLNO);
		Collections.sort(studentList, new StudentResultComparator(order));
		printStudentList(studentList);
		System.out.println("sorting by age...");
		order = new SortingFieldsOrderBean().addField(SortingField.AGE);
		Collections.sort(studentList, new StudentResultComparator(order));
		// Or Simply we can write as below
		// Collections.sort(studentList, SortingField.AGE);
		// Remember we have implemented java.util.Comparator in the SortingField as well
		// This will work ONLY when we have to sort on ONE field only.
		printStudentList(studentList);
		System.out.println("sorting by rollno in descending order...");
		order = new SortingFieldsOrderBean().addField(SortingField.ROLLNO, SortingOrder.DESC);
		Collections.sort(studentList, new StudentResultComparator(order));
		// Or Simply we can write as below
		// Collections.sort(studentList, SortingField.ROLLNO);
		printStudentList(studentList);
		System.out.println("sorting by result in ascending order...");
		order = new SortingFieldsOrderBean().addField(SortingField.RESULT)
				.addField(SortingField.MARKS, SortingOrder.DESC).addField(SortingField.ROLLNO);
		Collections.sort(studentList, new StudentResultComparator(order));
		printStudentList(studentList);
	}

	private static void printStudentList(ArrayList<Student> studentList) {
		for (Student student : studentList) {
			System.out.println(student);
		}
		System.out.println();
	}
}