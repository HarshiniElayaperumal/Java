import java.util.*;
public class sec
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        String str=sc.nextLine();

        String[] arr=str.split("\\s+");
        String l="";
        String sl="";
        for(int i=0;i<arr.length;i++)
        {
            int len=arr[i].length();
            if(len>l.length())
            {
                sl=l;
                l=arr[i];
            }
            else if(len>sl.length() && !arr[i].equals(l))
            {
                sl=arr[i];
            }
        }
        System.out.println(sl);
        System.out.println(sl.length());
    }
}