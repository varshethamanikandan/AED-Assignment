package edu.neu.mgen;

import java.util.ArrayList;

public class Chap5 {
   
        public static void main(String[] args) {
            String str = "Oakland";
          

        
            int length = str.length();
            System.out.println("Length of the string: " + length);

    
           
            char charAtIndex = str.charAt(2);
            System.out.println("Character at index 2: " + charAtIndex);
    
        
            String substring = str.substring(3);
            System.out.println("Substring \"land\" from Oakland: " + substring);
    
            
            String strInUpperCase = str.toUpperCase();
            System.out.println("String in capital letters: " + strInUpperCase);

            int[] abc = {1, 3, 5, 2, 5};
            int length1 = abc.length;
            System.out.println("Length of the array: " + length1);
            int lastMember = abc[5 - 1]; 
            System.out.println("Last member of the array: " + lastMember);

             ArrayList<String> cities = new ArrayList<String>();
        cities.add("Austin");
        cities.add("Houston");
        cities.add("Oakland");
        cities.add("Paris");
        cities.add("San Francisco");
        cities.add("Seattle");
        System.out.println(cities);
        cities.remove("Paris");
        System.out.println(cities);

        }
    }
    
    


