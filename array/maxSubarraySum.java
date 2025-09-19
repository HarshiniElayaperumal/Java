import java.util.*;
public class maxSubarraySum {
    public static int maxSum(int[] arr,int n)
    {
        int currSum=arr[0];
        int max=arr[0];
        for(int i=1;i<n;i++)
        {
            currSum=Math.max(arr[i],currSum+arr[i]);
            max=Math.max(currSum,max);
        }
        return max;
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
        System.out.println(maxSum(arr,n));
    }
}
