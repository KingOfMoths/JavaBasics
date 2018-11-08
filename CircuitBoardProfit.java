/** A program to calculate the profit on the sale of a single circuit board */

import java.util.Scanner;

public class CircuitBoardProfit
{
    public static void main (String[] args)
    {
        //CREATE scanner, declare input variables, and processing variables
        
        Scanner kb= new Scanner(System.in);
        
        double price= 0,       // user supplies price
               margin= 0.40,   // known profit margin
               profit= 0;      // calculation variable, used to display reslut

        //REQUEST user input

        System.out.println("Enter the cost of a circuit board, in dollars and cents, use no $ sign. Eg. 66.99");
        price= kb.nextDouble(); //stores the price of a circuit board to the price variable

        //PROCESS the input

        profit= price * margin;

        //DISPLAY the reslut

        System.out.println("The profit on each circuit board is $"+ profit);
    }
}

/* your off the edge of the map mate, here there be monsters */