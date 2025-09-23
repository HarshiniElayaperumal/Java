package sorting_algos;
import java.util.*;
public class bubbleSort {
    public static void bubbleSorting(int[] arr,int n)
    {
        for(int i=0;i<n-1;i++)
        {
            boolean swapped=false;
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if(swapped==false) break;
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
        bubbleSorting(arr,n);
        System.out.println("After Sorting: " + Arrays.toString(arr));
    }
}
