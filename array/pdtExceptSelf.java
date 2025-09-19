import java.util.*;
public class pdtExceptSelf {
    public static int[] pdtArray(int[] arr,int n)
    {
        int res[]=new int[n];
        res[0]=1;
        for(int i=1;i<n;i++)
        {
            res[i]=res[i-1]*arr[i-1];
        }
       int suffix=1;
        for(int i=n-1;i>=0;i--)
        {
            res[i]=res[i]*suffix;
            suffix*=arr[i];
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
        int[] res=pdtArray(arr,n);
        System.out.print(Arrays.toString(res));
    }
}
