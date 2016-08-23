package com.jny;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

	// write your code here
        while(true) {
            final Process clear = Runtime.getRuntime().exec("clear");
            System.out.print("*** MENU ***\n");
            System.out.print("1. INSERT\n");
            System.out.print("2. PRINT\n");
            System.out.print("3. SORT\n");
            System.out.print("4. END\n");
            System.out.print("Select : \n");

            Scanner scanIn = new Scanner(System.in);
            int menuNum = scanIn.nextInt();
            LinkedList simpleLinkedList ;
            simpleLinkedList = new LinkedList();

            switch (menuNum) {
                case 1:
                    System.out.print("Enter Integer: \n");
                    int data = scanIn.nextInt();
                    ListNode newNode = new ListNode(data);
                    simpleLinkedList.insertAtEnd(newNode);
                    break;
                case 2: //print(); break;
                    simpleLinkedList.head == null;

                    break;
                case 3: //sort(); break;
                    break;
                case 4: //exit(1);
                    break;
                default:
            }
        }

    }
}
