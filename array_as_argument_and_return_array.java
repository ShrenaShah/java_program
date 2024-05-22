import java.util.Scanner;

class ArrayAsArgumentAndReturnArray
{
    public static void main(String args[])
    {
        int[] arr;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        System.out.print("Enter Element of array: ");
        
        arr = new int[size];
        for(int i=0; i<size; i++)
        {
            arr[i] = sc.nextInt(); 
        }

        display (arr);

        int m[] = returnArray();
        for(int l:m)
        {
            System.out.println(l);
        }
    }
    public static void display(int a[])
    {
        for (int j:a)
        {
            System.out.println(j);
        }
    }
    public static int[] returnArray()
    {
        int marks[] = {1,2,3,4,5};
        return marks;
    }
}