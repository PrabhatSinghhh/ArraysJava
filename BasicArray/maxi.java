package BasicArray;

import java.util.Scanner;

public class maxi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of element: ");
        int n = sc.nextInt();
//        int[] arr = new int[n];
//        int mx = arr[0];
//        for (int i = 0; i < n; i++) {
//            System.out.print("element of array is: ");
//            arr[i] = sc.nextInt();
//
//
//            if (arr[i] > mx)
//                mx = arr[i];
//
//        }
//        System.out.println("maximum element of given array is: "+ mx);

        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println("sum of given element is "+ sum);
    }
}
