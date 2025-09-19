import java.util.*;
public class insertDupe {
    public static void alterarr(int[] arr,int n,int k)
    {
        int count=0;
        for(int num:arr)
        {
            if(num==k) count++;
        }
        for(int i=n-1;i>=0;i--)
        {
            int newIndex=i+count;
            if(newIndex<n)
            {
                arr[newIndex]=arr[i];
            }
            if(arr[i]==k)
            {
                count--;
                if(i+count<n)
                {
                    arr[i+count]=k;
                }
            }
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
        int k=sc.nextInt();
        alterarr(arr,n,k);
        System.out.print(Arrays.toString(arr));
    }
}
