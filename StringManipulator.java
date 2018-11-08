/** A program to manipulate string variables */

import java.util.Scanner;

public class StringManipulator
{
    public static void main (String[] args)
    {
        //CREATE scanner, declare input variables, processing variables
        
        Scanner kb = new Scanner(System.in);
        
        String  city,               // user defined string
                cityUpper,          // recieves the output of manipulation to uppercase
                cityLower;          // recieves the output of manipulation to lowercase
        char    first;              // stores the first character of user input
        int     cityCharCount;      // stores the number of characters of user input
        
        //REQUEST input

        System.out.println("Enter the name of your favourite city.");
        city= kb.nextLine();        //stores the string we will be manipulating

        //PROCESS the input

        cityUpper= city.toUpperCase();
        cityLower= city.toLowerCase();
        first= city.charAt(0);
        cityCharCount= city.length();

        //DISPLAY the result

        System.out.println("The results of the string manipulations are:\n"
                            +cityCharCount+"\n"
                            +cityUpper+"\n"
                            +cityLower+"\n"
                            +first);
    }
}

/* Slay the dragon // rescue the princess // get the gold */