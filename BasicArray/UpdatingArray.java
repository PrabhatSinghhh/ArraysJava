package BasicArray;

public class UpdatingArray {
    public static void main(String[] args) {
        int[] arr= new int[4];
        arr[0] = 23;
        arr[1] = 33;
        arr[2] = 43;
        arr[3] = 53;
        System.out.println(arr[2]);
        arr[2] = 90;
        System.out.println(arr[2]);
        arr[2] += 60;
        System.out.println(arr[2]);

    }
}
