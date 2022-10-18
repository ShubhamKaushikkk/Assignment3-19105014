import java.util.*;
public class Question2 {
    public static void sort(int arr[])
    {
        int n = arr.length;
        int o[]= new int[n];
        int c[]= new int[21];
        for(int i=0;i<=20;i++)
            c[i] = 0;
        for(int i=0;i<n;i++)
            c[arr[i]]++;
        for(int i=1;i<=20;i++)
            c[i] += c[i - 1];
        for(int i=n-1;i>=0;i--) {
            o[c[arr[i]]-1]=arr[i];
            c[arr[i]]--;
        }
        for(int i=0;i<n;i++)
            arr[i]=o[i];
    }
    public static void main(String []args){
        int[] arr = {15,4,7,5,8,9,5,4,10,19,11,15,12,20,9};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
