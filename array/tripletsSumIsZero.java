import java.util.*;
public class tripletsSumIsZero {
    private static List<List<Integer>> sumIsZero(int[] arr,List<List<Integer>> l,int n)
    {
        for(int i=0;i<n-2;i++)
        {
            for(int j=i+1;j<n-1;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    if(arr[i]+arr[j]+arr[k]==0)
                    {
                        List<Integer> r=Arrays.asList(arr[i],arr[j],arr[k]);
                        Collections.sort(r);
                        if(!l.contains(r))
                        l.add(r);
                    }
                }
            }
        }
        return l;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        sc.close();
        List<List<Integer>> l=new ArrayList<>();
        l=sumIsZero(arr,l,n);
        System.out.println(l);
    }
}
