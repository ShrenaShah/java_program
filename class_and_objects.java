/*name file which is similar to the class which has public static void main and make
class first and after this make any other class*/

import java.util.Scanner;

class ClassAndObject
{
    public static void main(String args[])
    {
        int num1,num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        num1 = sc.nextInt();

        System.out.println("Enter second number: ");
        num2 = sc.nextInt();

        Sum s = new Sum(num1,num2);

    }
}
class Sum
{
    public Sum(int num1,int num2)
    {
        int result = num1 + num2;
        System.out.print(result);
    }
}