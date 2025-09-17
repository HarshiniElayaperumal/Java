import java.util.*;
public class arrangeElementsBySign {
    public static void arrangeElements(int[] arr,int n)
    {
        List<Integer> pos=new ArrayList<>();
        List<Integer> neg=new ArrayList<>();
        for(int num:arr)
        {
            if(num>=0) pos.add(num);
            else neg.add(num);
        }
        int i=0,p=0,q=0;
        while(p<pos.size() && q<neg.size())
        {
            arr[i++]=pos.get(p++);
            arr[i++]=neg.get(q++);
        }
        while(p<pos.size())
        {
            arr[i++]=pos.get(p++);
        }
        while(q<neg.size())
        {
            arr[i++]=neg.get(q++);
        }
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
        arrangeElements(arr,n);
        System.out.print(Arrays.toString(arr));
    }
}
