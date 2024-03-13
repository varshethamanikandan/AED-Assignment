package edu.neu.mgen;

public class Chap8 {
  

        public static void main(String[] args) {
     
            String[] array1 = {"Anne", "John", "Alex", "Jessica"};
            System.out.println("Original array:");
            printArray(array1);
            System.out.println("End of the array\n");
            
        
            String[] reversedArray1 = reverseAndCapitalize(array1);
            System.out.println("Resultant array:");
            printArray(reversedArray1);
            System.out.println("End of the array\n");
            
      
            String[] array2 = {"Sun", "Mercury", "Venis", "Earth", "Mars", "Jupiter"};
            System.out.println("Original array:");
            printArray(array2);
            System.out.println("End of the array\n");
            
        
            String[] reversedArray2 = reverseAndCapitalize(array2);
            System.out.println("Resultant array:");
            printArray(reversedArray2);
            System.out.println("End of the array");
        }
 
        public static String[] reverseAndCapitalize(String[] array) {
            String[] reversedArray = new String[array.length];
            for (int i = 0; i < array.length; i++) {
                reversedArray[i] = reverseAndCapitalizeString(array[i]);
            }
            return reversedArray;
        }
    
    
        public static String reverseAndCapitalizeString(String str) {
            StringBuilder reversed = new StringBuilder();
            for (int i = str.length() - 1; i >= 0; i--) {
                if (i == str.length() - 1) {
                    reversed.append(Character.toUpperCase(str.charAt(i)));
                } else {
                    reversed.append(Character.toLowerCase(str.charAt(i)));
                }
            }
            return reversed.toString();
        }
    
        // Method to print the elements of the array
        public static void printArray(String[] array) {
            for (String element : array) {
                System.out.println("\"" + element + "\",");
            }
        }
    }
    

