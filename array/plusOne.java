import java.util.*;
public class plusOne {
    public static int[] plus(int[] arr,int n)
    {
        int carry=1;
        for(int i=n-1;i>=0;i--)
        {
            int sum=arr[i]+carry;
            arr[i]=sum%10;
            carry=sum/10;
        }
        if(carry>0)
        {
            int res[]=new int[n+1];
            res[0]=carry;
            for(int i=0;i<n;i++)
            {
                res[i+1]=arr[i];
            }
            return res;
        }
        return arr;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int res[]=plus(arr,n);
        StringBuilder sb=new StringBuilder();
        for(int num:res)
        {
            sb.append(num);
        }
        System.out.println(sb.toString());
    }
}
