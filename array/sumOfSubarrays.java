import java.util.*;
public class sumOfSubarrays {
    public static long findSum(int[] arr,int n)
    {
        long res=0;
        for(int i=0;i<n;i++)
        {
            res+=(long)arr[i]*(i+1)*(n-i);
        }
        return res;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(findSum(arr,n));
    }
}
