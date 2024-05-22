import java.util.Scanner;

class Overloading
{
    public static void main(String args[])
    {
        int n1,n2,n3;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        Calc s1 = new Calc(n1,n2);

        System.out.print("Enter three numbers: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();
        Calc s2 = new Calc(n1,n2,n3);
    }
}

class Calc
{
    public Calc(int n1,int n2)
    {
        int add = n1 + n2;
        System.out.println(add);
    }

    public Calc(int n1,int n2,int n3)
    {
        int sub = n1 - n2 - n3;
        System.out.println(sub);
    }
}