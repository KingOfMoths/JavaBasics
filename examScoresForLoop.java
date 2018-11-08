/* 1. [10 marks]Write a program that helps a professor process student exam scores.
 The program should start by asking the user (professor) for the number of students in the class. 
 Use an input validation loop to ensure that the number of students is positive. 
 The program should then read that number of scores. 
 The program should compute the average, the lowest score in the class, 
 and the number of students who scored higher than 75. 
 Use only while loops for this question 
 (don't use "do-while" loops or "for" loops). Hint: your program will include two separate loops.
 
2. [10 marks]Re-solve the previous question, using a "do-while" loop for input validation, 
and a "for" loop for the main loop. */


//IMPORT scanner 
//DECLARE
//INPUT nStudents, >0, 
//CALC while loops only. averageScore, lowest mark, nAbove 75%
//OUTPUT

import java.util.Scanner;

public class examScoresForLoop
{
    public static void main (String[] args)
    {
        Scanner kb= new Scanner(System.in);
        int nMarks= 0, topQuartile= 0;
        double userMark, markAccumulator= 0, markSmallest= 100;
        
       
        do
        {
            System.out.println("\nEnter the number of marks to assess.\n" 
            +"The number of marks must be greater than 0.");
            nMarks= kb.nextInt();
        }
        while(nMarks <=0);

        for(int nCount= 1; nCount <= nMarks; nCount++)
        {
            System.out.println("Enter mark #" +nCount);
            userMark= kb.nextDouble();
            markAccumulator += userMark;
            if (userMark < markSmallest)
                markSmallest= userMark;
            if(userMark >= 75.00)
                topQuartile++;
        }
        
        System.out.printf("The average mark is: %.2f%%\n", (markAccumulator/nMarks));
        System.out.println("The number of marks above 75% is: " +topQuartile);
        System.out.println("The lowest mark is: "+markSmallest+ "%");
    }
}