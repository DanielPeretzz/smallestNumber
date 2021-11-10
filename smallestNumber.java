import java.util.Arrays;
import java.util.Scanner;

public class smallestNumber {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = {6, 19, -1, -5 };
        seondsmallest(array);
    }


    static void seondsmallest(int[] arr) {
    int tmp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]){
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }

            }

        }
        System.out.println("the second smallest number is : " + arr[1]);
    }
}
