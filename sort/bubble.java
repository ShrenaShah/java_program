import java.util.Scanner;
import java.util.Arrays;

class Bubble {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();

        int[] arrayElements = new int[size];

        System.out.println("Enter array elements: ");
        for (int i = 0; i < size; i++) {
            arrayElements[i] = sc.nextInt();
        }
    

        for (int i = 0; i < (size - 1); i++) {
            for (int j = 0; j < (size - 1 - i); j++) {
                if (arrayElements[j] > arrayElements[j + 1]) {
                    int a = arrayElements[j];
                    arrayElements[j] = arrayElements[j + 1];
                    arrayElements[j + 1] = a;
                }
            }
        }
        System.out.println("sorted array: " + Arrays.toString(arrayElements));
    }
}