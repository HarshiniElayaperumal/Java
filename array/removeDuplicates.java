import java.util.*;
public class removeDuplicates {
    public static int removedupe(int[] arr)
    {
        HashSet<Integer> set=new HashSet<>();
        for(int num:arr)
        {
            set.add(num);
        }
        int i=0;
        for(int num:set)
        {
            arr[i++]=num;
        }
        return set.size();
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
        int len=removedupe(arr);
        for(int i=0;i<len;i++)
        System.out.print(arr[i]+" ");
    }
}
