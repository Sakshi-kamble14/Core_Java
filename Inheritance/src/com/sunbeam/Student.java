package com.sunbeam;


class Person{
	String name;
	Person(String name){
		this.name=name;
	}
}
public class Student extends Person{

	int roll_no;
	String add;
	
	Student(String name,int roll_no,String add) {
		super(name);
		this.roll_no=roll_no;
		this.add=add;
		// TODO Auto-generated constructor stub
	}

	public  void print() {
		System.out.println("Name - "+this.name+" Roll number - "+this.roll_no+" Address - "+this.add);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student("Sakshi",123,"Shahapur");
		s.print();

	}

}
