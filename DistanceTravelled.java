import java.util.Scanner;

public class DistanceTravelled
{
    public static void main (String[] args)
    {
        Scanner kb= new Scanner(System.in);
        double userSpeed;
        int userHours, iterator=1;          //iterator also used in output as hours, set to 1

        do
        {
            System.out.println("\n--------------------------------------------------\n"
                +"Enter the speed in miles."
                +"\n--------------------------------------------------\n");
            userSpeed= kb.nextDouble();
        }
        while(userSpeed <0);                //requires entry to be a +ve value

        do
        {
            System.out.println("\n--------------------------------------------------\n"
                +"Enter the number of whole hours traveled."
                +"\n--------------------------------------------------\n");
            userHours= kb.nextInt();
        }
        while(userHours <1);                //requires entry to be 1 or greater

        System.out.println("\nHour        Distance\n____________________");

        while(iterator <= userHours)        //iterator initialized at 1, ends with userHours value
        {
            System.out.println(iterator+ "            " +(userSpeed*iterator));
            iterator++;                     //prints (hour)-------(distance) on n=userHours separate lines
        }
    }
}