import java.util.Scanner;

class TryCatch
{
    public static void main(String args[])

    {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for division: ");
        num = sc.nextInt();

        try
        {
            int j;
            j = 10/num;
            System.out.println("Devision = " + j);
        }
        catch(Exception e)
        {
            System.out.println("Something Went wrong try again.....");
        }

        System.out.println("Continue for the next");
    }

}