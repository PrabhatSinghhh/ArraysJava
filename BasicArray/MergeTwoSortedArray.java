package BasicArray;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] a = {11,33,43,71};
        int[] b= {26,54,69,81,90,98};
        int m= a.length;
        int n= b.length;
        int[] c= new int[m+n];
        int i=0,j=0,k=0;
        while(i<m && j<n){
            if(a[i]<=b[j]){
                c[k]=a[i];
                i++; k++;
            } else {
                c[k]=b[j];
                j++; k++;
            }
        }
        while (i<m){
            c[k]=a[i];
            i++; k++;
        }
        while (j<n){
            c[k]=b[j];
            j++; k++;
        }
        System.out.println("Merged Array:");
        for (int ele:c) {
            System.out.print(ele+" ");
        }
    }
}
