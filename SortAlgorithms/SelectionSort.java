import java.util.Random;
import java.util.Scanner;

public class SelectionSort {


    static void implement(int[] arr, int n) {
        int index;

        for (int i = 0; i < n - 1; i++) {
            index = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[index];
            arr[index] = tmp;
        }

    }

    public static void main(String[] args) {


        Random rand = new Random();
        int n = rand.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt();
        }
        implement(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}
