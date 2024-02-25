package BasicArray;

public class ReverseArray {
    public static void main(String[] args) {
        int[]arr= {1,2,3,4,5,56,67,7};
        int n= arr.length;
        System.out.println("Array before reversing :");
        for (int j:arr) {
            System.out.print(j+" ");
        }
        int i=0, j=n-1;
        while (i<=j){
            int temp= arr[i];
            arr[i]= arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        System.out.println();
        System.out.println("Array after reversing :");
        for (int ele: arr) {
            System.out.print(ele+" ");
        }

        }
    }

