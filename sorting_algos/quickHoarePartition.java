package sorting_algos;
import java.util.*;
public class quickHoarePartition {
    public static int partition(int[] arr,int low,int high)
    {
        int pivot=arr[low];
        int i=low-1;
        int j=high+1;

        while(true)
        {
            do
            {
                i++;
            }
            while(arr[i]<pivot);
            do
            {
                j--;
            }
            while(arr[j]>pivot);

            if(i>=j)
            {
                return j;
            }

            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
    public static void quickSortHoare(int arr[],int low,int high)
    {
        if(low<high)
        {
            int pi=partition(arr,low,high);
            quickSortHoare(arr, low, pi);
            quickSortHoare(arr, pi+1, high);
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
        System.out.println("Before Sorting: " + Arrays.toString(arr));
        quickSortHoare(arr,0,n-1);
        System.out.println("After Sorting: " + Arrays.toString(arr));
    }
}
