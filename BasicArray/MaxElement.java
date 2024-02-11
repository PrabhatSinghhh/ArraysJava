package BasicArray;

import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) {
       int[] arr = {23,4,5,567,889,67,78,8,9,9,9,997,65};
       int n = arr.length;
       int max = arr[0];
        for (int j : arr) {
            if (j > max) max = j;
        }
        System.out.println(max);
    }
}
