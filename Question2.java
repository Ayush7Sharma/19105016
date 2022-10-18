import java.util.Arrays;
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
        int[] arr = {9,20,12,15,11,19,10,4,5,9,8,5,7,4,15};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
