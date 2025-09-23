package sorting_algos;
import java.util.*;
public class selectionSort {
    public static void selectionSorting(int[] arr,int n)
    {
        for(int i=0;i<n-1;i++)
        {
            int minIdx=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[minIdx])
                {
                    minIdx=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minIdx];
            arr[minIdx]=temp;
        }
    }
    public static void  main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("Before Sorting: " + Arrays.toString(arr));
        selectionSorting(arr,n);
        System.out.println("After Sorting: " + Arrays.toString(arr));
    }
}
