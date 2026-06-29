package studentarraylist;


import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Student> students = new ArrayList<>();
		
		
		students.add(new Student(105, "Conor De Laurell", "Monument"));
		students.add(new Student(109, "John Denver", "Denver"));
		students.add(new Student(103, "Christopher Cross", "Telluride"));
		students.add(new Student(102, "Jim Croce", "Aspen"));
		students.add(new Student(107, "Michael De Laurell", "Monument"));
		students.add(new Student(101, "Michael McDonald", "Breckenridge"));
		students.add(new Student(108, "Elijah Wood", "Longmont"));
		students.add(new Student(111, "Sean Astin", "Denver"));
		students.add(new Student(116, "Billy Boyd", "Fort Collins"));
		students.add(new Student(112, "Dominic Monaghan", "Denver"));
		students.add(new Student(132, "Viggo Mortensen", "Boulder"));
		
		
		
		
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
