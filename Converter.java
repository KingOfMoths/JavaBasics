/** A Program to convert a cash value into the least possible peices of change */

import java.util.Scanner;

public class Converter
{
    public static void main (String[] args)
    {
        //CREATE scanner, declare input variables and processing variables
        
        Scanner kb = new Scanner(System.in);
        
        double input;       // recieves user input of cash value
        int makesCents= 0,  // retains the value, in cents, remaining to be converted to change
            dollars= 0,     // max # of peices. stored and value deducted from 'makesCents'
            quarters= 0,    // max # of peices. stored and value deducted from 'makesCents'        
            dimes= 0,       // max # of peices. stored and value deducted from 'makesCents'
            nickles= 0,     // max # of peices. stored and value deducted from 'makesCents'
            pennies= 0;     // # of peices stored.

        //REQUEST input

        System.out.println("Enter a value of change in dollars and cents, use no $ sign. Eg. 66.99");
        input = kb.nextDouble();

        //PROCESS the input

        makesCents= (int)(input*100);//converts input to cents

        dollars= makesCents/100;    // determines the # of peices of change, passes on the remainder, in cents.
        makesCents= makesCents%100;

        quarters= makesCents/25;    // self documenting code is best, recursive code requires self-referential commentary!
        makesCents= makesCents%25;

        dimes= makesCents/10;       // this is not recursive
        makesCents= makesCents%10;

        nickles= makesCents/5;
        makesCents= makesCents%5;

        pennies= makesCents;

        //DISPLAY the result

        System.out.println( "$" +input+ " is equivalent to\n"+
                            +dollars+ " Dollars\n"+
                            +quarters+ " Quarters\n"+
                            +dimes+ " Dimes\n"+
                            +nickles+ " Dimes and\n"+
                            +pennies+ " Pennies");   
    }
}