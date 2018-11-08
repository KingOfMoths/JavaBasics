//IMPORT

import java.util.Scanner;

public class Billing
{
    public static void main (String[] args)
    {
        //DECLARE

        Scanner kb= new Scanner(System.in);

        String userPlan= "X";
        double 
            userMinutes,
            billAmt= 0;
        final double 
            A_IncludedMins= 450,
            A_Rate= 0.45, 
            A_cost= 39.99,
            
            B_IncludedMins= 900,
            B_Rate= 0.40,
            B_cost= 59.99,
            
            C_IncludedMins= 0,
            C_Rate= 0,
            C_cost= 69.99;

        boolean flagValidPlan= true;
    

        //INPUT

        System.out.println("\n-------------------------$#-------------------------\n"
            +"Enter the number of minutes used this month."
            +"\n-------------------------$#-------------------------\n");
        userMinutes= kb.nextDouble();
            kb.nextLine();

        System.out.println("\n-------------------------$#-------------------------\n"
            +"Enter a letter to select your plan. Choose A B or C"
            +"\n-------------------------$#-------------------------\n");
        
        userPlan= kb.nextLine();
            userPlan= userPlan.toUpperCase();

        //CALCULATE

        switch(userPlan)
        {
            case "A":
                if(userMinutes-A_IncludedMins > 0)
                {
                    billAmt= (userMinutes- A_IncludedMins) * A_Rate;
                    billAmt= billAmt+ A_cost;
                }
                else
                {
                    billAmt= billAmt+ A_cost; //plan cost only
                }
                break;
            case "B":
                if(userMinutes- B_IncludedMins > 0)
                {
                    billAmt= (userMinutes- B_IncludedMins) * B_Rate;
                    billAmt= billAmt+ B_cost;
                }
                else
                {
                    billAmt= billAmt+ B_cost; //plan cost only
                }
                break;
            case "C":
                if(userMinutes > C_IncludedMins)
                {
                    billAmt= (userMinutes- C_IncludedMins) * C_Rate;
                    billAmt= billAmt+ C_cost;    //plan cost only
                }
                else
                {
                    billAmt= billAmt+ C_cost; //plan cost only
                }
                break;
            default:
                flagValidPlan= false;
                
        }

        //OUTPUT

        if(flagValidPlan)
        {
            System.out.printf("\n-------------------------$#-------------------------\n"
                    +"Your total bill is $%.2f"
                    +"\n-------------------------$#-------------------------\n\n", billAmt );
        }
        else
        {
            System.out.println("\n-------------------------$#-------------------------\n"
                    +"You have not selected a valid plan. Please try again"
                    +"\n-------------------------$#-------------------------\n");//

        }

    }
}