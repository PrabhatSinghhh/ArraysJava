package BasicArray;

public class SumOfArrays {
    public static void main(String[] args) {
        int[] arr= {23,45,6,7,8,9,8,65,5};
        int sum= 0;
        for (int i =0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
