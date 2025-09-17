import java.util.*;
public class stockSell1 {
    public static int maxStock(int[] arr)
    {
        int minprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int price:arr)
        {
            if(price<minprice)
            {
                minprice=price;
            }
            else if(price-minprice>maxprofit)
            {
                maxprofit=price-minprice;
            }
        }
        return maxprofit;
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
        int res=maxStock(arr);
        System.out.println(res);
    }
}
//Time complexity:O(n)

/*public class stockSell1
{
    public static int maxStock(int[]arr,int n)
    {
        int maxProfit=0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                maxProfit=Math.max(maxProfit,(arr[j]-arr[i]));
            }
        }
        return maxProfit;
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
        int res=maxStock(arr,n);
        System.out.println(res);
    }
}*/
//Time complexity:o(n^2)