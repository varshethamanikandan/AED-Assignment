package edu.neu.mgen;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
   
        Scanner scanner = new Scanner(System.in);
                // Declare and initialize variables of different types
                int num1 = 07; //convert initialized variables of type "long" to "int"
                int num2 = 19;
        
                long longValue3 = 10000000000L; //  Long is for integer numbers
                long longValue4 = 20000000000L;
        
                double doubleValue1 = 7.02; //Double is for real numbers
                double doubleValue2 = 19.28;
        
                boolean booleanValue1 = true;
                boolean booleanValue2 = false;
        
                char Alphabet1 = 'V';
                char Alphabet2 = 'A';

                System.out.println("Enter two values for long variables:");
                long longValue1 = scanner.nextLong();
                long longValue2 = scanner.nextLong();

                System.out.println("Enter two values for double variables:");
                double doubleeValue1 = scanner.nextDouble();
                double doubleeValue2 = scanner.nextDouble();
        
                System.out.println("Enter two values for boolean variables (true or false):");
                boolean booleannValue1 = scanner.nextBoolean();
                boolean booleannValue2 = scanner.nextBoolean();
        
                System.out.println("Enter two characters for char variables:");
                char charValue1 = scanner.next().charAt(0);
                char charValue2 = scanner.next().charAt(0);
        
                // Print the values of the variables
                System.out.println("long values: " + num1 + ", " + num2);
                System.out.println("long values: " + longValue3 + ", " + longValue4);
                System.out.println("double values: " + doubleValue1 + ", " + doubleValue2);
                System.out.println("boolean values: " + booleanValue1 + ", " + booleanValue2);
                System.out.println("char values: " + Alphabet1 + ", " + Alphabet2);

                System.out.println("long values: " + longValue1 + ", " + longValue2);
                System.out.println("double values: " + doubleeValue1 + ", " + doubleeValue2);
                System.out.println("boolean values: " + booleannValue1 + ", " + booleannValue2);
                System.out.println("char values: " + charValue1 + ", " + charValue2);

                System.out.println("Arithmetic Operations:");
                System.out.println("intValue1 + intValue2 = " + (num1 + num2));
                System.out.println("intValue1 - intValue2 = " + (num1 - num2));
                System.out.println("intValue1 * intValue2 = " + (num1* num2));
                System.out.println("intValue1 / intValue2 = " + (num1/ num2));
        
                System.out.println("doubleValue1 + doubleValue2 = " + (doubleValue1 + doubleValue2));
                System.out.println("doubleValue1 - doubleValue2 = " + (doubleValue1 - doubleValue2));
                System.out.println("doubleValue1 * doubleValue2 = " + (doubleValue1 * doubleValue2));
                System.out.println("doubleValue1 / doubleValue2 = " + (doubleValue1 / doubleValue2));
                System.out.println("It's my first Java program");        
               
            }
          
        }
        
        
    

       

