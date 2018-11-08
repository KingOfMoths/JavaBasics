//IMPORT
import java.util.Scanner;

public class Sides
{
    public static void main (String[] args)
    {
//DECLARE
        double side1, side2, side3;
        boolean oneTwo, twoThree, threeOne;
        Scanner kb= new Scanner(System.in);
//INPUT
        System.out.println("Enter a side length");
            side1= kb.nextDouble();

        System.out.println("Enter a side length");
            side2= kb.nextDouble();

        System.out.println("Enter a side length");
            side3= kb.nextDouble();
//CALC//OUTPUT
        oneTwo= side1==side2;
        twoThree= side2==side3;
        threeOne= side3==side1;

        if(oneTwo && twoThree && threeOne)
            System.out.println("it is equilateral.");
        else 
        {
            if (oneTwo  || twoThree  ||  threeOne)
                System.out.println("it is isosceles.");
            else
                System.out.println("it is scalene.");
        }
    }
}
