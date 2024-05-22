import java.util.Scanner;

class MultipleInheritance
{
    public static void main(String args[])
    {
        Average a = new Average();
        a.operation();
        a.sum();
        a.average();
    }
}

class Calc
{
    int num1,num2;
    void operation()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
    }
}

class Sum extends Calc
{
    int sum;
    void sum()
    {
        sum = num1 + num2;
        System.out.println("addition = " + sum);
    }
}

class Average extends Sum
{
    void average()
    {
        int average;
        average = sum/2;
        System.out.println("Average of both number is : " + average);
    }
}