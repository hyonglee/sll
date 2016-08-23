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

            String menuNum;
            Scanner scanIn = new Scanner(System.in);
            menuNum = scanIn.nextLine();
            LinkedList sLL ;
            sLL = new LinkedList();

            switch (Integer.parseInt(menuNum)) {
                case 1:
                    ListNode newNode = new ListNode(1);
                    sLL.insertAtEnd(newNode);
                    break;
                case 2: //print(); break;
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
