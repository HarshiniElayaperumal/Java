import java.util.*;
public class learderElement {
    public static List<Integer> leaders(int[] arr,int n)
    {
        List<Integer> result=new ArrayList<>();
        int maxRight=arr[n-1];
        result.add(maxRight);
        for(int i=n-2;i>=0;i--)
        {
            if(arr[i]>=maxRight)
            {
                result.add(arr[i]);
                maxRight=arr[i];
            }
        }
        Collections.reverse(result);
        return result;
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
        System.out.println(leaders(arr,n));
    }
}
