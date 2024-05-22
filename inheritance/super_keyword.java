//super keyword is use for inherit method of parent class//

import java.util.Scanner;

class HirachicalInheritance
{
    public static void main(String args[])
    {
        Calc c = new Calc();
        Sum a = new Sum();
        Sub b = new Sub();

        c.operation();
        a.add();
        b.minus();
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
    int add;
    void add()
    {
        add = num1 + num2;
        System.out.println("Sum: " + add);
    }
    super.operation();
}
class Sub extends Calc
{
    int minus;
    void minus()
    {
        minus = num1 - num2;
        System.out.println("Sub: " + minus);
    }
    super.operation();
}