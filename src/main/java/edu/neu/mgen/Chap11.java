package edu.neu.mgen;

import java.util.Scanner;


public class Chap11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            System.out.print("Are you a graduate student: ");
            String student = scanner.nextLine();

            System.out.print("Enter your age: ");
            int age = scanner.nextInt();


       


            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Student: " + student);
           
     
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter valid data.");
        } finally {
            scanner.close();
        }
    }
}

    

