import java.util.Scanner;

class StringClass
{
    public static void main(String args[])
    {
        String name = new String();
        String address = new String();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter address: ");
        address = sc.nextLine();
        System.out.println("Your name is" + " "+name + " "+"and address is "+" "+address); 
    }
}