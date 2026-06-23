package com.sunbeam;

import java.util.Scanner;

public class Student {

    public static int menu(Scanner sc) {
        System.out.println("-------------------");
        System.out.println("0: Exit");
        System.out.println("1: Add Student");
        System.out.println("2: Display Students");
        System.out.println("3: Update Student Name");
        return sc.nextInt();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array of students
        Addstudent[] arr = new Addstudent[5];

        // Default students
        arr[0] = new Addstudent(101, "Amit", "Nashik");
        arr[1] = new Addstudent(102, "Priya", "Pune");
        arr[2] = new Addstudent(103, "Rahul", "Mumbai");

        int index = 3; // next free position
        int choice;

        while ((choice = menu(sc)) != 0) {
            switch (choice) {

                case 1:
                    if (index < arr.length) {
                        System.out.print("Enter Roll No: ");
                        int roll = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Address: ");
                        String addr = sc.nextLine();

                        arr[index] = new Addstudent(roll, name, addr);
                        index++;

                        System.out.println("Student added successfully!");
                    } else {
                        System.out.println("Array is full!");
                    }
                    break;

                case 2:
                    System.out.println("Student List:");
                    for (int i = 0; i < index; i++) {
                        System.out.println(arr[i]);
                    }
                    break;

                case 3:
                    System.out.print("Enter Roll No to update: ");
                    int roll = sc.nextInt();
                    sc.nextLine();

                    boolean found = false;

                    for (int i = 0; i < index; i++) {
                        if (arr[i].getRollno() == roll) {
                            System.out.print("Enter New Name: ");
                            String newName = sc.nextLine();

                            arr[i].setName(newName);

                            System.out.println("Student name updated successfully!");
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Roll number not found!");
                    }
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }

        System.out.println("Program exited.");
        sc.close();
    }
}