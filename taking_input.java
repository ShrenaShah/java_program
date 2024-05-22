/*When you use the new keyword followed by a constructor, it allocates memory 
for an object and initializes the object using the specified constructor.*/
 
import java.util.Scanner;

class Taking_input
{
    public static void main(String args[])
    {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of number: ");
        num = sc.nextInt();

        System.out.print(num);
    }
}