import java.util.*;
public class minimizeHeights2 {
    public static int minheight(int[] arr,int n,int k)
    {
        Arrays.sort(arr);
        int ans=arr[n-1]-arr[0];
        int smallest=arr[0]+k;
        int largest=arr[n-1]-k;
        for(int i=1;i<n;i++)
        {
            if(arr[i]-k<0) continue;
            int minH=Math.min(smallest,arr[i]-k);
            int maxH=Math.max(largest,arr[i-1]+k);

            ans=Math.min(ans,maxH-minH);
        }
        return ans;
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
        int k=sc.nextInt();
        System.out.println(minheight(arr,n,k));
    }
}
