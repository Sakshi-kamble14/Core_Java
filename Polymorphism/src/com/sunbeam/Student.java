package com.sunbeam;


public class Student {

	String name;
	int roll_no;
	String add;
	String section;
	
	Student(String name,int roll_no,String add,String section){
		this.name=name;
		this.roll_no=roll_no;
		this.add=add;
		this.section=section;
	}
	
	public void print() {
		System.out.println("Name - "+this.name+" Roll number - "+this.roll_no+" Address - "+this.add+" Section - "+this.section);
	}
	
	public void print(boolean hidesection) {
		System.out.println("Name - "+this.name+" Roll number - "+this.roll_no+" Address - "+this.add+" Section - "+(hidesection?" ":this.section));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student("Sakshi",123,"Shahapur","IX");
		s.print();
		s.print(true);
		s.print(false);

	}

}
