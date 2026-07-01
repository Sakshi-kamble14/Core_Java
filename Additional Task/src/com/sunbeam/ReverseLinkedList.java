package com.sunbeam;

import java.util.Scanner;

class LinkNode {
    int val;
    LinkNode next;

    public LinkNode(int val) {
        this.val = val;
    }
}

public class ReverseLinkedList {

    public static LinkNode reverse(LinkNode head) {
        LinkNode prev = null, next = null, curr = head;

        while (curr != null) {
            next = curr.next;   // store next node
            curr.next = prev;   // reverse link
            prev = curr;        // move prev ahead
            curr = next;        // move curr ahead
        }
        return prev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkNode node, head = null, curr = null;

        System.out.println("How many Nodes?");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            node = new LinkNode(sc.nextInt());

            if (head == null) {
                head = node;
                curr = node;
            } else {
                curr.next = node;
                curr = node;
            }
        }

        System.out.println("Reversed linked list:");
        LinkNode trav = reverse(head);

        while (trav != null) {
            System.out.print(trav.val + " ");
            trav = trav.next;
        }

        sc.close();
    }
}