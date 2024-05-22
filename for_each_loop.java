/*normal for loop also can be use in this kinf of program but by using for each loop
it will make program short and it is a short way of for loop nothing else but in for
each loop you can not access any perticular member of an array it is just use for
traversing all the elements*/

import java.util.Scanner;

class ForEachLoop
{
    public static void main(String args[])
    {
        int arr[] = {1,2,3,4,5};
        for(int i : arr)
        {
            System.out.println("array: " + i);
        }
    }
}