import java.util.Scanner;

class ObjectAsAParameter
{
    public static void main(String args[])
    {
        int n1,n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();

        Calc d = new Calc(n1 + n2);

        Result s = new Result(d);
    }
}

class Result 
{
    public Result(Calc d)
    {
        int div = d.getResult()/2;
        System.out.print(div);
    }
}

class Calc 
{
    private int result;

    public Calc(int sum) 
    {
        result = sum;
    }

    public int getResult() 
    {
        return result;
    }
}