package com.company;

import java.util.Scanner;

public class Main {
     static Scanner scanner;
  static   String[] va = {"Black","Brown","Red","Orange","Yellow","Green","Blue","Violet","Grey","White"};
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        boolean c = true;
        int z;
	// write your code here

      while (c){

          System.out.println("Enter (1) for Resistor Color");
          System.out.println("Enter (2) to exit");
          z = scanner.nextInt();
          if (z==1){
              System.out.println("Enter Resistor Color to check the index?");
              String input = scanner.next();
              checkcolor(input);
          }else {
              System.exit(0);
          }



      }



    }

    private static void checkcolor(String input) {
        for (int i=0; i<=va.length-1; i++){
            if (va[i].equalsIgnoreCase(input)){
                System.out.println(i);
              //  System.exit(0);
            }
        }
    }
}
