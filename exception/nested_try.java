import java.util.Scanner;

class NestedTry
{
    public static void main(String args[])
    {
        int arr[] = new int[5];
        int num1,num2,result;
        Scanner sc = new Scanner(System.in);
        try
        {
            System.out.println("Enter two numbers: ");
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            result = num1/num2;
            System.out.println("Result = " + result);

            try
            {
                System.out.println("Enter array elements: ");
                for(int i=0; i<=4; i++)
                {
                    arr[i] = sc.nextInt();
                }
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("You have entered more than 5 numbers");
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println("number cannot divide by zero");
        }
        System.out.println("END");
    }
}