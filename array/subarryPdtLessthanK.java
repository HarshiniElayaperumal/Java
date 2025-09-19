import java.util.Scanner;

public class subarryPdtLessthanK {
    public static int countSubarr(int[] arr,int n,int k)
    {
        int left=0,count=0,pdt=1;
        for(int right=0;right<n;right++)
        {
            pdt*=arr[right];
            while(pdt>=k && left<=right)
            {
                pdt/=arr[left];
                left++;
            }
            count+=(right-left+1);
        }
        return count;
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
        System.out.println(countSubarr(arr,n,k));
    }
}
