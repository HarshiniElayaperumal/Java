import java.util.*;
public class missingRanges {
    public static List<List<Integer>> findMissingRange(int[] arr,int lower,int upper)
    {
        int n=arr.length;
        List<List<Integer>> res=new ArrayList<>();
        int prev=lower-1;
        for(int i=0;i<=n;i++)
        {
            int curr=(i<n)?arr[i]:upper+1;
            if(prev+1<=curr-1)
            {
                res.add(Arrays.asList(prev+1,curr-1));
            }
            prev=curr;
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
        int lower=sc.nextInt();
        int upper=sc.nextInt();
        System.out.println(findMissingRange(arr,lower,upper));
    }
}
