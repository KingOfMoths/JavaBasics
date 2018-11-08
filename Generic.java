/*

*/ 
//IMPORT
//DECLARE
//INPUT
//CALC
//OUTPUT

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.*;
import java.*;

public class Generic
{
    public static void main (String[] args)
    {
        Scanner kb= new Scanner(System.in);
        double a=0,b=0,c=0,x=0,y=0,z=0;
        int i=0, j=0, k=0;

    ///////////////////////////////////////////////////////////////////////////
        Math.log(x); // ln of x
        a= Math.log(x)/ Math.log(z);  // (log base z) of x
        Math.pow(x,y); // x to the power y, (x, 1/y) is x to the y root
        Math.exp(x);  // e to the power x
        
        
        //must: import java.util.Random;
        Random rand= new Random();
        x= rand.nextDouble(); //0.0-1.0
        x= rand.nextInt(i); //0-(i-1)
        //or
        rand= (int)(Math.random()*10); //returns int 0-9, calls random class internally, less efficient, .random() returns double 0.0-0.99999...
    ///////////////////////////////////////////////////////////////////////////

        
        
    
   ///////////////////////////////////////////////////////////////////////////
        //if else
        if(x<y)
        {
            kb.next(); 
        }
        else
        {
            kb.next();
        }

        //switch 
        switch(x)
        {
            case 1:
                kb.next();
                break;
            case 2:
                kb.next();
                break;
            default:
                kb.next(); 
        }
    ///////////////////////////////////////////////////////////////////////////
        
        x= kb.nextDouble();
        kb.next();      //clears the return left on the buffer

        System.out.printf("it is %.1d", x); //decimal, to one place, %% printsliteral%,
        String escapesequences= ("\n \t \b \r \\ \' \""); //newline tab backspace carriagereturn backslash singleq doubleq
        //use \\ for files in string literals going to windows directories

        System.out.println("\n-------------------------\n"
            +"nice message block"
            +"\n-------------------------\n");

    
    ///////////////////////////////////////////////////////////////////////////
        //Common Loop Design Patterns

        //Counting Loops 
        for (int i = 0 ; i < n ; i ++)  //initialization(s/0); test; update(s/0)
        {
            kb.next();
        }

        //Sentinel Controlled Loop
        System.out.println(" Enter a number 1-10(0 will terminate the loop))");
        int x= kb.nextInt();    //priming read necessary
        while (x != 0) 
        {   
            int accumulator = accumulator +x; //process the input
            System.out.println("running total: " +accumulator);

            System.out.println(" Enter a number 1-10 (0 will terminate the loop))");
            int x= kb.nextInt();
        }

        //Input Validation Loop
        do
        {
            System.out.println(" Enter a number (integer, 1-10)");
            int x= kb.nextInt();
        }
        while(x <1 || 10< x); //requires input value 1-10

        //End-of-File Loop
        while (inputFile.hasNext()) //false if '[]' EoF Char
        {
            String str= inputFile.nextLine();   //read file
            System.out.println(str);    //process file
        }

    ///////////////////////////////////////////////////////////////////////////
        //file handling

        //must: import java.io.*; before class header
        //must: ...(string[] args) throws IOException   in method header
        
        //write to a file
        PrintWriter outputFile= new PrintWriter("data.txt"); // will erase+replace if data.txt is on disk
        outputFile.println("straight is the path and narrow is the gate."); //or printf
        outputFile.close();
        
        //append a file
        FileWriter fw= new FileWriter("data.txt", true); //will not erase files which exist
        PrintWriter outputFile= new PrintWriter(fw);
        //or create annon file object
        PrintWriter outputFile= new PrintWriter(new FileWriter("data.txt", true));

        //file location
        // \ escape sequence, use \\ if in string literal, \ in windows file directories

        //reading a file
        File myFile= new File("data.txt");  //create file object
        Scanner inputFile= new Scanner(myFile); //pass file object to scanner constructor
        //or create annon file object
        Scanner inputFile= new Scanner(new File("data.txt")); //create a scanner over the file
        String str= inputFile.nextLine();   //read from the file
        inputFile.close();  //close file
        
        //avoid end of file exceptions
        while (inputFile.hasNext()) //only false if '[]' EoF Char
        {
            String str= inputFile.nextLine();   //read file
            System.out.println(str);    //process file
        }
        inputFile.close();
        //
        System.out.print("Enter the file name: ");  // to enter a string
        userFile= kb.nextLine();                    // to pass string into new file
        File getFile= new File(userFile);           // to pass file into new scanner
        if(!getFile.exists())                       //test the users file entry for validity
            {System.out.println("file not found"); System.exit(0);}
        Scanner inputFile= new Scanner(getFile);    // to create a scanner over the string entered





    ///////////////////////////////////////////////////////////////////////////
    }
}