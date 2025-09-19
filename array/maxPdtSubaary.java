import java.util.*;
public class maxPdtSubaary {
    public static int maxPdt(int[] arr,int n)
    {
        int maxEndingHere=arr[0];
        int minEndingHere=arr[0];
        int res=arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]<0)
            {
                int temp=maxEndingHere;
                maxEndingHere=minEndingHere;
                minEndingHere=temp;
            }
            maxEndingHere=Math.max(arr[i],maxEndingHere*arr[i]);
            minEndingHere=Math.min(arr[i],minEndingHere*arr[i]);
            res=Math.max(res,maxEndingHere);
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
        System.out.println(maxPdt(arr,n));
    }
}
