package edu.neu.mgen;
import java.util.Scanner;

public class Chap6 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any word:");
        String word = scanner.nextLine().trim();
        long startTime = System.currentTimeMillis();

        if (word.isEmpty()) {
            System.out.println("You did not enter any word");
            System.exit(0);
        }

        int wordLength = word.length();
        String classification;
        if (wordLength <= 5) {
            classification = "short";
        } else if (wordLength <= 11) {
            classification = "medium";
        } else {
            classification = "long";
        }

        long endTime = System.currentTimeMillis();
        double reactionTime = (endTime - startTime) / 1000.0; // Convert to seconds

        System.out.println("Your word is " + word);
        System.out.println("The length of the word is " + wordLength);
        System.out.println("It is a " + classification + " word");
        System.out.println("Your reaction time is " + reactionTime + " seconds");

       
    }
}


