
import java.util.Scanner;

public class examScoresWhileLoop
{
    public static void main (String[] args)
    {
        Scanner kb= new Scanner(System.in);
        int nMarks= 0, nCount= 1, topQuartile= 0;
        double userMark, markAccumulator= 0, markSmallest= 100;
        
        System.out.println("Enter the number of marks to assess.");
        nMarks= kb.nextInt();

        while(nMarks <=0)
        {
            System.out.println("The number of marks must be greater than 0.\n" 
                +"Enter the number of marks to assess.");
            nMarks= kb.nextInt();
        }

        while(nCount <= nMarks)
        {
            System.out.println("Enter mark #" +nCount);
            userMark= kb.nextDouble();
            markAccumulator += userMark;
            if (userMark < markSmallest)
                markSmallest= userMark;
            if(userMark > 75.00)
                topQuartile++;

            nCount++;
        }

        System.out.printf("The average mark is: %.2f%%\n", (markAccumulator/nMarks));
        System.out.println("The number of marks above 75% is: " +topQuartile);
        System.out.println("The lowest mark is: "+markSmallest+ "%");
    }
}