package com.codedifferently.labs.partA.ex03;

import java.util.Scanner;

public class ComputeFare {
    public static int compute (int age){
        /* Put your code in between these comments : Top */
        String response = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("");

        System.out.println("Enter your age: ");
        age = scanner.nextInt();
        int fare;
        if (age < 11) {
            fare = 3;
        } else if (age > 11 && age < 65) {
            fare = 5;
        } else {
            fare = 3;

        }
        System.out.println("The fare is:$" + fare);

        /* Put your code in between these comments : Bottom */



    return fare;
    }
    public static void main(String args[]) {
        int age = 0;
        /* Put your code in between these comments : Top */


        /* Put your code in between these comments : Bottom */

        int computeOutput = compute(age);
        System.out.println(computeOutput);


    }
}
