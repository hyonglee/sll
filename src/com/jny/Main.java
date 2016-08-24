package com.jny;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    static void insertNode(LinkedList simpleLinkedList){
        System.out.print("Enter Integer: \n");
        Scanner scanIn = new Scanner(System.in);
        int data = scanIn.nextInt();
        ListNode newNode = new ListNode(data);
        simpleLinkedList.insertAtEnd(newNode);
    }
    static void printNode(LinkedList simpleLinkedList){
        ListNode currentNode;

        if(simpleLinkedList.head == null){
            System.out.print("Empty List\n");
            return;
        }
        System.out.print("\n<PRINT>\n");
        currentNode = simpleLinkedList.head;
        while(currentNode.next != null)
        {
            System.out.print(currentNode.data+" -> ");
            currentNode = currentNode.next;
        }
        System.out.print(currentNode.data+"\n");
    }
    static void sortNode(LinkedList simpleLinkedList){

    }
    public static void main(String[] args) throws IOException {
        LinkedList simpleLinkedList ;
        simpleLinkedList = new LinkedList();

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

            switch (menuNum) {
                case 1:
                    insertNode(simpleLinkedList);
                    break;
                case 2:
                    printNode(simpleLinkedList);
                    break;
                case 3:
                    sortNode(simpleLinkedList);
                    break;
                case 4:
                    return;
                default:
            }
        }

    }
}
