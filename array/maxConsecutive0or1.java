// import java.util.*;
// public class maxConsecutive0or1 {
//     public static void main(String[] args)
//     {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int arr[]=new int[n];
//         for(int i=0;i<n;i++)
//         {
//             arr[i]=sc.nextInt();
//         }
//         int count=1,maxC=0;
//         for(int i=0;i<n-1;i++)
//         {
//             if(arr[i]==arr[i+1])
//             {
//                 count++;
//             }
//             else{
//                 maxC=Math.max(maxC,count);
//                 count=1;
//             }
            
//         }
//         System.out.println(Math.max(maxC,count));
//         sc.close();
//     }
// }
// O(n) Time and O(1) Space
import java.util.*;
public class maxConsecutive0or1 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int count=0,maxC=0,prev=-1;
        for(int  num:arr)
        {
            if((prev^num)==0)
            {
                count++;
            }
            else{
                maxC=Math.max(count,maxC);
                count=1;
            }
            prev=num;
        }
        System.out.println(Math.max(maxC,count));
        sc.close();
    }
}