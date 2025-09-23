package sorting_algos;
import java.util.*;
public class quickSort {
    public static int partition(int[] arr,int low,int high)
    {
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<=high-1;j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return i+1;
    }
    public static void swap(int[] arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void quickSorting(int[] arr,int low,int high)
    {
        if(low<high)
        {
            int pi=partition(arr,low,high);
            quickSorting(arr, low,pi-1);
            quickSorting(arr,pi+1, high);
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
        quickSorting(arr,0,n-1);
        System.out.println("After Sorting: " + Arrays.toString(arr));
    }
}
