/*
Assignment 2: Group Students by City Using Map

Create a class Student
Attributes:
name 
city 
Requirements:
Create a parameterized constructor to initialize the object. 
Create a method getDetail() to display the student's details.

Create a class School
Inside the main() method:
Input the number of students from the user. 
Create an ArrayList<Student>. 
Input the details of n students and add them to the ArrayList. 
Create a Map<String, ArrayList<Student>> where: 
Key → City 
Value → List of students belonging to that city 
Display all cities along with the students belonging to each city.

Example Output:
City : Jaipur
--------------------
Amit
Rahul

City : Delhi
--------------------
Neha
Karan
*/


import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

class Student {

	String name ;
	String city ;

	Student(String name , String city) {
		this.name = name ;
		this.city = city ;
	}

	void getDetails() {
		System.out.println("Student name is =" +  name + "And its city is = " + city);
	}

}

public class School {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);



		System.out.println("Please provide how many number of student do you want ");
		int numberOfStudent = sc.nextInt();
		sc.nextLine();

		//Adding students in list
		List<Student> list = new ArrayList<>();
	
		for(int i = 1 ; i <= numberOfStudent ; i++) {
			System.out.println("Please provide " + i + "Student name");
			String name = sc.nextLine();

			System.out.println("Please provide " + i + "Student city");
			String city = sc.nextLine();
			
			Student o = new Student(name , city);
			
			list.add(o);
		}
		
		for(Student s : list) {
			System.out.println(s.name + " " + s.city);
		}

		Map<String, ArrayList<Student>> map = new HashMap<>();

		for(Student s : list) {
			if( !(map.containsKey(s.city)) ) {
				map.put(s.city , new ArrayList<>());	
			}

			map.get(s.city).add(s);
   		}

		for (HashMap.Entry<String, ArrayList<Student>> m : map.entrySet()) {
            		System.out.print(m.getKey() + " ---- ");
			
			for (Student s : m.getValue()) {
             			System.out.println(s.name);
            		}
       		}
		
	}

}