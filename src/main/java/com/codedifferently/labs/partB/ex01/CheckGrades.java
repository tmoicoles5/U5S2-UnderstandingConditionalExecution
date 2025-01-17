package com.codedifferently.labs.partB.ex01;

import java.util.Scanner;

public class CheckGrades {

    public static String checkGrades() {
        String response = "";
        Scanner scanner = new Scanner(System.in);
        int totalSubjects = 5;
        System.out.println("Enter your Math grade:  ");
        int math = scanner.nextInt();
        System.out.println("Enter your Science grade: ");
        int science = scanner.nextInt();

        System.out.println("Enter your Geography grade: ");
        int geography = scanner.nextInt();

        System.out.println("Enter your English grade: ");
        int english = scanner.nextInt();

        System.out.println("Enter your Java grade: ");
        int java = scanner.nextInt();
        int totalGrade = math +science +geography +java +english;
        double percentage = (totalGrade / (double)(totalSubjects * 100)) *100;
        System.out.println("Total grade for all five subjects: "+totalGrade);
        System.out.println("Your percentage is : " +percentage);
        scanner.close();
        return response;

    }

    public static void main(String args[]) {
        String gradesOutput = checkGrades();
        System.out.println(gradesOutput);
    }
}