import java.util.Scanner;

class CustomException
{
    public static void main(String args[])
    {
        int num1, num2, result;
        System.out.println("Enter two numberes: ");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        System.out.println(" " + num1 + " " + num2);

        try
        {
            if(num1 <= 0 || num2 <= 0)
            {
                throw new ShrenaException("Negative or zero not excepted");
            }
            result = num1 / num2;
            System.out.println(result);
        }
        catch(ShrenaException f)
        {
            System.out.println("Catching Exception: " + f);
        }
        System.out.println("Code Completed");
    }
}

class ShrenaException extends Exception
{
    public ShrenaException(String s)
    {
        super(s);
    }
}
