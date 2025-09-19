import java.util.*;
public class missingRepeating {
    public static int[] findMissRepeat(int[] arr,int n)
    {
        int repeat=-1,miss=-1;
        int freq[]=new int[n+1];
        for(int num:arr)
        {
            freq[num]++;
        }
        for(int i=1;i<=n;i++)
        {
            if(freq[i]==2 ) repeat=i;
            if(freq[i]==0) miss=i;
        }
        return new int[]{repeat,miss};
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
        int res[]=findMissRepeat(arr,n);
        System.out.print(Arrays.toString(res));
    }
}
