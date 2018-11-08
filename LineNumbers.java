

import java.io.*;
import java.util.Scanner;

public class LineNumbers
{
    public static void main (String[] args) throws IOException
    {
        Scanner kb= new Scanner(System.in);
        String userFile;
        int lineCount=1;
/*
        System.out.println("\n----------------------------------------------------------------------------\n"
            +"If you want to read about the Frankie's godawful fat cat enter TestFile.txt\n"
            +"If you want to poetry to move your soul enter FileTest.txt"
            +"\n----------------------------------------------------------------------------\n");


        System.out.print("\nEnter the file name: ");// to enter a string
        userFile= kb.nextLine();                    // to pass string into new file
        File getFile= new File(userFile);           // to pass file into new scanner
        if(!getFile.exists())                       //test the users file entry for validity
        {
            System.out.println("file not found");
            System.exit(0); 
        }
        Scanner inputFile= new Scanner(getFile);    // to create a scanner over the string entered

        
        while (inputFile.hasNext()) 
        {
            String str= inputFile.nextLine();           //read file
            System.out.println(lineCount+ ": " +str);   //prepend line numbers to sequential lines of inputfile
            lineCount++;                                //update line number counter   
        }
        inputFile.close();
*/
        System.out.println("Press any key to continue..."); 
        kb.nextLine();
         
    }
}