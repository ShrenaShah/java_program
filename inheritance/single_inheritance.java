import java.util.Scanner;

class SingalInheritance
{
    public static void main(String args[])
    {
        Bonus d = new Bonus();
        d.salary();
        d.bonus();
    }
}
class Salary
{
    int salary;
    void salary()
    {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter salary of empolyee: ");
            salary = sc.nextInt();
    }
}

class Bonus extends Salary
{
    void bonus()
    {
        int bonus = (salary*10)/100;
        System.out.println("Bonus of employee is: " + bonus);
    }
}