import java.util.*;
public class stockSell2 {
    public static int maxProfit(int[] arr)
    {
        int maxStock=0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>arr[i-1])
            {
                maxStock+=(arr[i]-arr[i-1]);
            }
        }
        return maxStock;
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
        int res=maxProfit(arr);
        System.out.println(res);
    }
}
