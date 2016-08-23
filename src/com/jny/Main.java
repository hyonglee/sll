package com.jny;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

	// write your code here
        final Process clear = Runtime.getRuntime().exec("clear");
        System.out.print("*** MENU ***");
        System.out.print("1. INSERT");
        System.out.print("2. PRINT");
        System.out.print("3. SORT");
        System.out.print("4. END");
        System.out.print("choice : ");

        String menuNum;
        Scanner scanIn = new Scanner(System.in);
        menuNum = scanIn.nextLine();

        switch(Integer.parseInt(menuNum))
        {
            case 1 :
                //insert(); break;
                break;
            case 2 : //print(); break;
                break;
            case 3 : //sort(); break;
                break;
            case 4 : //exit(1);
                break;
            default:
        }

    }

    }
}
