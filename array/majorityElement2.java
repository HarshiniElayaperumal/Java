import java.util.*;
public class majorityElement2 {
    public static List<Integer> majele(int[] arr,int n)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:arr)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer> list=new ArrayList<>();
        for(int key:map.keySet())
        {
            if(map.get(key)>n/3)
            list.add(key);
        }
        Collections.sort(list);
        return list;
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
        List<Integer> res=majele(arr,n);
        System.out.println(res);
    }
}
