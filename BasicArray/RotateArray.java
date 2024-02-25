package BasicArray;

public class RotateArray {
      public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5};
            int n = arr.length;
            int rotateBy = 2; // Number of positions to rotate the array

            // Display the original array
            System.out.println("Original Array:");
            displayArray(arr);

            // Rotate the array
            rotate(arr, rotateBy);

            // Display the rotated array
            System.out.println("\nArray after rotation:");
            displayArray(arr);
        }

        // Function to rotate the array to the right by 'd' positions
        public static void rotate(int[] arr, int d) {
            int n = arr.length;
            reverse(arr, 0, n - 1);
            reverse(arr, 0, d - 1);
            reverse(arr, d, n - 1);
        }

        // Function to reverse an array or its part from index 'start' to 'end'
        public static void reverse(int[] arr, int start, int end) {
            while (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        // Function to display the contents of an array
        public static void displayArray(int[] arr) {
            for (int value : arr) {
                System.out.print(value + " ");
            }
        }
    }
