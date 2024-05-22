import java.util.Scanner;
class MultipleInheritance
{
    public static void main(String args[])
    {
        SubjectMarks a = new SubjectMarks();
        a.marks();
        TotalMarks b = new TotalMarks();
        b.total();
        Result c = new Result();
        c.percentage();
    }
}

class SubjectMarks
{
    int m1,m2,m3;
    void marks()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of a subject: ");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
    }
}

class TotalMarks
{
    int t1,t2,t3;
    void total()
    {
        Scanner sa = new Scanner(System.in);
        System.out.println("Enter Total marks of a subject: ");
        this.t1 = sa.nextInt();
        this.t2 = sa.nextInt();
        this.t3 = sa.nextInt();
    }
}

class Result extends SubjectMarks implements TotalMarks
{
    int p1,p2,p3;
    void percentage()
    {
        System.out.println("Percentage of Maths: " + p1);
        System.out.println("Percentage of Chemistry: " + p2);
        System.out.println("Percentage of Physics: " + p3);
    }
    super.marks();
    super.total();
}