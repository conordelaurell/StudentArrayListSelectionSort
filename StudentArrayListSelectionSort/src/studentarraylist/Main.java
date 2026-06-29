package studentarraylist;


import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Student> students = new ArrayList<>();
		
		
		students.add(new Student(105, "Conor", "De Laurell"));
		students.add(new Student(109, "John", "Denver"));
		students.add(new Student(103, "Christopher", "Cross"));
		students.add(new Student(102, "Jim", "Croce"));
		students.add(new Student(107, "Michael", "De Laurell"));
		students.add(new Student(101, "Michael", "McDonald"));
		students.add(new Student(108, "Elijah", "Wood"));
		students.add(new Student(111, "Sean", "Astin"));
		students.add(new Student(116, "Billy", "Boyd"));
		students.add(new Student(112, "Dominic", "Monaghan"));
		students.add(new Student(132, "Viggo", "Mortensen"));
		
		
		
		
		System.out.println("Original List");
		for (Student s : students) {
			
			
			System.out.println(s);
		}
		
		
		SelectionSort.sort(students, new NameComparator());
		
		
		
		System.out.println("\nSorted by Name");
		
		
		
		for (Student s : students) {
			
			System.out.println(s);
			
			
		}
		
		
		SelectionSort.sort(students,  new RollNoComparator());
		
		
		
		System.out.println("\nSorted by Roll Number");
		
		
		for (Student s : students) {
			
			System.out.println(s);
			
			
		}

	}

}
