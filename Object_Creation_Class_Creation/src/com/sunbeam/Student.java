package com.sunbeam;


// Class creation
public class Student {
//	Fields of class  --->Where variable declaration
	private String name;
	private int roll_no;
	private String add;
	
//	Constructor
	public Student(String name,int roll_no,String add) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.roll_no=roll_no;
		this.add=add;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
//		Object creation
		Student s=new Student("Sakshi",123,"Shahapur");
		System.out.println("Name - "+s.name+"Roll number - "+s.roll_no+"Address - "+s.add);
		

	}

}
