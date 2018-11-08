import java.util.Scanner;
import java.util.Random;

public class RandomNumberGuessingGame
{
    public static void main (String[] args)
    {
        Scanner kb= new Scanner(System.in);
        int rand, userGuess= 69;                    //userGuess initialized outside valid input range to trigger while loop

        
        //Random rndm= new Random();
        //rand= rndm.nextInt(11);                   //0-(11-1)
        
        rand= new Random().nextInt(11);             //0-(11-1)
       

        while(userGuess != rand)                    //true until correct guess is entered
        {
            do
            {
                System.out.println("\n--------------------------------------------------\n"
                    +"Can you read my mind? Enter your guess (integer, 1-10)"
                    +"\n--------------------------------------------------\n");
                userGuess= kb.nextInt();
            }
            while(userGuess <1 || 10< userGuess);//requires input value 1-10

            if(userGuess < rand)                 //3 else nested tests of (userGuess against rand) and 3 respective outputs
             
            {
                System.out.println("\n--------------------------------------------------\n"
                    +"You're to small. Try again!"
                    +"\n--------------------------------------------------\n");
            }
            else 
            {
                if(userGuess > rand)
                {
                    System.out.println("\n--------------------------------------------------\n"
                        +"You're to large. Try again!"
                        +"\n--------------------------------------------------\n");
                }
                else 
                {
                    if(userGuess == rand)       //while loop must now be false program ends after println
                    {
                        System.out.println("\n--------------------------------------------------\n"
                            +"You gotter otter!"
                            +"\n--------------------------------------------------\n");
                    }
                }
            }
        }
    }
}