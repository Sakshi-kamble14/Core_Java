package com.sunbeam;

import java.util.Scanner;


public class LinkedlistAfter {

    public static void display(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static Node insertFirst(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        return newNode;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Node head = null;
        Node tail = null;

        System.out.print("How many nodes? ");
        int n = sc.nextInt();

        // Taking values from user
        for (int i = 0; i < n; i++) {
            System.out.print("Enter value: ");
            int value = sc.nextInt();

            Node newNode = new Node(value);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        System.out.println("Linked List:");
        display(head);

        System.out.print("Enter value to insert at first: ");
        int x = sc.nextInt();

        head = insertFirst(head, x);

        System.out.println("After insertion:");
        display(head);

        sc.close();
    }
}