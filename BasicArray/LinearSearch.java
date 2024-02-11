package BasicArray;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the target element: ");
        int t = sc.nextInt();
        System.out.print("enter the size of array: ");
        int n = sc.nextInt();
        int [] arr= new int[n];
        System.out.print("enter the elements of array: ");
        for (int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        boolean flag = false;
        for (int i= 0;i<n;i++) {
            if (arr[i] == t) {
                flag = true;
                break;
            }
        }
        if (flag) System.out.println("element found");
        else System.out.println("element not found");


        }


    }

