import java.util.Scanner;
import java.util.Arrays;

public class binary_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();

        int arrayElements[] = new int[size];
        System.out.println("Enter sorted array elements: ");
        for(int i=0; i<size; i++){
            arrayElements[i] = sc.nextInt();
        }
        System.err.println("enter the number which you want to search: ");
        int num = sc.nextInt();

        int small = 0;
        int large = size-1;
        boolean found = false;

        while (small<=large){
            int mid = (small + large)/2;

            if(num == arrayElements[mid]){
                System.out.println("position of number is: " + (mid + 1) );
                found = true;
                break;
            }
            else if(num<arrayElements[mid]){
                large = mid - 1;
            }
            else {
                small = mid + 1;
            }
        }
        if(!found){
            System.out.println("number not found in the array");
        }
        
    }
}