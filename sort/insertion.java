import java.util.Scanner;
import java.util.Arrays;

public class insertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();

        int arrayElements[] = new int[size];
        System.out.println("Enter array elements: ");
        for(int i=0; i<size; i++){
            arrayElements[i] = sc.nextInt();
        }
        
        for(int j=1; j<size; j++){
            int key = arrayElements[j];
            int k = j-1;
            while(k >= 0 && arrayElements[k]>key){
                arrayElements[k+1] = arrayElements[k];
                k--;
            }
            arrayElements[k+1] = key;
        }

        System.out.println("sorted array: " + Arrays.toString(arrayElements));
        sc.close();
    }
}