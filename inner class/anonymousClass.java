import java.util.Scanner;

// class A
// {
//     int a = 20;
//     public void demo()
//     {
//         System.out.println("Number : " + a);
//     }
// }

class AnonymousClass
{
    public static void main(String args[])
    {
        A obj = new A()
        {
            public void demo()
            {
                System.out.println("Number : " + (a+2));
            }
        };
        obj.demo();
    }
}