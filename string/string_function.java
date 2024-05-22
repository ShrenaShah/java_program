/*next() is for getting string without space just like scanf()
and nextLine() is for getting whole string with space just like gets()
1)length function is use for finding length of string
2)charAt function is use for access all elements of string*/

import java.util.Scanner;

class String_function
{
    public static void main(String args[])
    {
        String s = new String();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        s = sc.nextLine();
        System.out.println(s.length());

        for(int i=0; i<s.length(); i++)
        {
            System.out.println(s.charAt(i));
        }
    }
}