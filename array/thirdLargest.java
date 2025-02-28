import java.util.*;
public class thirdLargest {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int idx=0;idx<n;idx++)
    {
        arr[idx]=sc.nextInt();
    }
    int largest=Integer.MIN_VALUE;
    int secLargest=Integer.MIN_VALUE;
    int thLargest=Integer.MIN_VALUE;
    for(int i=0;i<n;i++)
    {
        if(arr[i]>largest)
        {
            thLargest=secLargest;
            secLargest=largest;
            largest=arr[i];
        }
        else if(arr[i]>secLargest)
        {
            thLargest=secLargest;
            secLargest=arr[i];
        }
        else if(arr[i]>thLargest)
        {
            thLargest=arr[i];
        }
    }
      System.out.println(thLargest);
      sc.close();
    }

}
