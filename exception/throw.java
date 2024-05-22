/*
throw: Imagine you're baking a cake, and suddenly you realize you're out of eggs.
You'd say, "Oops! No eggs!" and stop right there.

throws: Now, let's say you're planning a picnic, and you tell your friends, 
"Hey, there might be rain tomorrow, so bring umbrellas."

So, throw is like shouting "Oops!" when something bad happens in your code, 
while throws is like warning others about possible problems your method might cause.
*/

import java.util.Scanner;

class Throw
{
    public static void main(String args[])
    {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        num = sc.nextInt();

        try
        {
            int j;

            if(num == 0)
            {
                throw new ArithmeticException("Cannot devide by zero");
            }
            j = 100/num;
            System.out.println("Division = " + j);
        }
        catch(ArithmeticException e)
        {
            int j;
            j = 100/1;
            System.out.println("That is the default output " + j);

        }
        catch(Exception e)
        {
            System.out.println("something went wrong please try again...");
        }

        System.out.println("END");
    }
}