/*
program can be execute with or without finally block but if there will be any kind of
exception in try block than catch block will execute and after this finally block will
execute but exp : in this program if we get exception than output will be like 
    Exception: java.lang.ArithmeticException: / by zero
    I am in finally block
but if we remove catch block than output will be like 
    I am in finally block
    Exception in thread "main" java.lang.ArithmeticException: / by zero
    at Finally.main(finally.java:22)

mostly finally block is uses for closing any file wich was open in try block
*/


import java.util.Scanner;

class Finally
{
    public static void main(String args[])
    {
        int num1,num2,result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers for devision: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        try
        {
            result = num1/num2;
            System.out.println(result);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception: " + e);
        }
        finally
        {
            System.out.println("I am in finally block");
        }
    }
}