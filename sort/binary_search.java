import java.util.Scanner;

public class binary_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the arraySize of array: ");
        int arraySize = sc.nextInt();

        int arrayElements[] = new int[arraySize];
        System.out.println("Enter sorted array elements: ");
        for(int i=0; i<arraySize; i++){
            arrayElements[i] = sc.nextInt();
        }
        System.err.println("enter the number which you want to search: ");
        int num = sc.nextInt();

        int smallIndex = 0;
        int largeIndex = arraySize-1;
        boolean found = false;

        while (smallIndex<=largeIndex){
            int midIndex = (smallIndex + largeIndex)/2;

            if(num == arrayElements[midIndex]){
                System.out.println("position of number is: " + (midIndex + 1) );
                found = true;
                break;
            }
            else if(num<arrayElements[midIndex]){
                largeIndex = midIndex - 1;
            }
            else {
                smallIndex = midIndex + 1;
            }
        }
        if(!found){
            System.out.println("number not found in the array");
        }
        sc.close();
    }
}