import java.util.Scanner;
import java.util.Arrays;

public class selection {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();

        int[] arrayElements = new int[size];

        System.out.println("Enter array elements: ");
        for (int i = 0; i < size; i++) {
            arrayElements[i] = sc.nextInt();
        }

        for (int j = 0; j < size - 1; j++) {
            int min = j;
            for (int d = (j + 1); d < size; d++) {
                if (arrayElements[d] < arrayElements[min]) {
                    min = d;
                }
            }
            int temp = arrayElements[min];
            arrayElements[min] = arrayElements[j];
            arrayElements[j] = temp;
        }
        System.out.println("sorted array: " + Arrays.toString(arrayElements));
    }
}
