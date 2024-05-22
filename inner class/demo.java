import java.util.Scanner;

class Demo
{
    public static void main(String args[])
    {
        B obj1 = new B();
        obj1.show();

        B.A obj2 = obj1.new A();
        obj2.inner();
    }
}

class B
{
    int a = 10;

    public void show()
    {
        System.out.println("Age = " + a);
    }

    class A
    {
        public void inner()
        {
            System.out.println("2nd Age = "+ (a + 10));
        }
    }
}
