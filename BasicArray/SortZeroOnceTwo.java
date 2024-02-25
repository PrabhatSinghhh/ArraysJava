package BasicArray;

public class SortZeroOnceTwo {
    public static void main(String[] args) {
        int[] arr={1,2,0,0,1,2,1,2,0,0,2,0,1,0,2,1,0,2,1};
        int n= arr.length;
        int mid=0, low = 0, high = n-1;
        while(mid<=high){
            if (arr[mid]==0) {
                int temp= arr[mid];
                arr[mid]= arr[low];
                arr[low]= temp;
                low++; mid++;
            }
            else if (arr[mid]==1) {
                mid++;
            }
            else   {
                int temp= arr[mid];
                arr[mid]= arr[high];
                arr[high]= temp;
                high--;
            }
        }
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
