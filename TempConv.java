public class TempConv
{
    public static void main (String[] args)
    {
        int iterator=0;
        double toF;

        System.out.println("\n\n*C\t\t*F\n-----------------");

        while(iterator <=20)
        {
            toF= 9/(double)5*(double)iterator +32;
            System.out.printf("%.1f\t\t%.1f\n",(double)iterator, toF);
            iterator++;
        }
    }
}