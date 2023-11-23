// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;   //Import integer
public class Main {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);  // check input
        System.out.print("Enter the number : ");

        n = input.nextInt();     //input n
        int[] arr = new int[n];  //crete arr
        System.out.print("Array elements before sorting: \n");

        for(int i = 0; i < n; i++){     //loop input
            arr[i] = input.nextInt();   //arr input n
        }

        /*Test reading array elements from Input user
        System.out.println("Array elements are: ");
        for (int i = 0; i < n; i++)
        {
            System.out.println(arr[i]);
        }
        */

        sorted_ascending(arr, arr.length);
        for (int j : arr) {
            System.out.println(j);
        }
    }

    private static void sorted_ascending(int[] arr,int n){
        {
            for (int i = 0; i < n; i++){
                int j = i;
                int k = arr[i];
                while ((j > 0) && (arr[j-1] < k))
                {
                    arr[j] = arr[j-1];
                    j--;
                }
                arr[j] = k;
            }
        }
    }
}