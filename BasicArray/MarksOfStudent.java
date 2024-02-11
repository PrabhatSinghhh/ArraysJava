package BasicArray;
/*Given an array of marks of students, if the mark of any
student is less than 35 print its roll number. [roll number
here refers to the index of the array.
*/

public class MarksOfStudent {
    public static void main(String[] args) {
        int[]arr={83,34,56,78,31,19,57,89,90,29};
        int n = arr.length;
        for (int i= 0;i<n;i++){
            if (arr[i]<35)
        System.out.println(i+" ");
        }
    }

}
