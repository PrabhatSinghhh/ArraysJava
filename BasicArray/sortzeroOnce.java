package BasicArray;

public class sortzeroOnce {
    public static void main(String[] args) {
        int[] arr= {0,1,1,1,0,1,0,1,0,1,1,1,1,1,0,0,0,1,0};
        int n= arr.length;
        int noofZeros=0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) noofZeros++;
        }
        for (int i = 0; i < noofZeros; i++) {
            arr[i]=0;

        }
        for (int i = noofZeros; i < n; i++) arr[i] = 1;
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        }
    }

