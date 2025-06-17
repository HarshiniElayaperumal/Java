import java.util.*;
public class longestPalindromicSubstring{
public static boolean isPalin(String str,int start,int end)
{
    while(start<end)
    {
        if(str.charAt(start)!=str.charAt(start))
        {
            return false;
        }
        else{
            start++;
            end--;
        }
    }
    return true;
}

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        int len=0;
        String lp="";
        for(int i=0;i<str.length();i++)
        {
            for(int j=i+1;j<str.length();j++)
            {
                if(str.charAt(i)==str.charAt(j) && isPalin(str,i,j+1)&& j-i+1>len)
                {
                    len=j-i+1;
                    lp=str.substring(i,j+1);
                }
            }
        }
        System.out.println(lp);
        sc.close();
    }
}