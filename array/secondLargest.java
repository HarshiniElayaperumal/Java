import java.util.*;
public class secondLargest {
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
    for(int i=0;i<n;i++)
    {
        if(arr[i]>largest)
        {
            secLargest=largest;
            largest=arr[i];
        }
        else if(arr[i]<largest && arr[i]>secLargest)
        {
            secLargest=arr[i];
        }
    }
    if(secLargest<0)
        System.out.println("no secLargest");
      else   System.out.println(secLargest);
      sc.close();
    }

}
