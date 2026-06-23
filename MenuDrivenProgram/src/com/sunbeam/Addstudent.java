package com.sunbeam;

public class Addstudent {
    private int rollno;
    private String name;
    private String add;

    public Addstudent() {
        this.rollno = 0;
        this.name = "";
        this.add = "";
    }

    public Addstudent(int rollno, String name, String add) {
        this.rollno = rollno;
        this.name = name;
        this.add = add;
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

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

	@Override
	public String toString() {
		return "Addstudent [rollno=" + rollno + ", name=" + name + ", add=" + add + "]";
	}

    
}