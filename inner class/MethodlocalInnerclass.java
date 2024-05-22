import java.util.Scanner;

class MethodLocalInnerClass
{
    public static void main(String args[])
    {
        A obj = new A();
        obj.demo();
    }
}

class A
{
    int a = 20;

    public void demo()
    {
        class InnerClass
        {
            public void num()
            {
                System.out.println("Number = " + a);
            }
        }

        InnerClass obj1 = new InnerClass();
        obj1.num();
    }
}
