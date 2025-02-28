import java.util.*;
public class maxTripletPdt {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE,smax=Integer.MIN_VALUE,tmax=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE,smin=Integer.MAX_VALUE;
        for(int idx=0;idx<n;idx++)
        {
            if(arr[idx]>max)
            {
                tmax=smax;
                smax=max;
                max=arr[idx];
            }
            else if(arr[idx]>smax)
            {
                tmax=smax;
                smax=arr[idx];
            }
            else if(tmax<arr[idx])
            {
                tmax=arr[idx];
            }

            if(arr[idx]<min) 
            {
                smin=min;
                min=arr[idx];
            }
            else if(arr[idx]<smin)
            {
                smin=arr[idx];
            }
        }
        int pdt=Math.max(max*smax*tmax,max*min*smin);
        System.out.println(pdt);
        sc.close();
    }
}
