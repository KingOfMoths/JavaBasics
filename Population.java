
import java.util.Scanner;
import java.util.Random;

public class Population
{
    public static void main (String[] args)
    {
        Scanner kb= new Scanner(System.in);
        int userDays, userNumOrg=0, iterator=0;
        double userRate=-1, rate, dailyPop;

        do
        {
            System.out.println("\n--------------------------------------------------\n"
                +"How many organisims on the first day? (whole number 2 or more)"
                +"\n--------------------------------------------------\n");
            userNumOrg= kb.nextInt();
        }
        while(userNumOrg <2 );
        dailyPop= (double)userNumOrg;

        do
        {
            System.out.println("\n--------------------------------------------------\n"
                +"How fast do they multiply each day? (as a percentage)"
                +"\n--------------------------------------------------\n");
            userRate= kb.nextDouble();
        }
        while(userNumOrg <0 );
        rate= userRate/100;

        do
        {
            System.out.println("\n--------------------------------------------------\n"
                +"For how many days? (whole number 1 or more)"
                +"\n--------------------------------------------------\n");
            userDays= kb.nextInt();
        }
        while(userNumOrg <1 );

        System.out.println("Day\t\tPop.\n----------------------");

        while(iterator < userDays)
        {
            iterator++;
            System.out.printf("%.1f\t\t%.1f\n", (double)iterator, dailyPop);   
            dailyPop= dailyPop +(dailyPop*rate);
        }
    }
}