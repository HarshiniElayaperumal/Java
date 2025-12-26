import java.util.*;
public class countCharOccurence
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		HashSet<Character> set=new HashSet<>();
		for(char c:s2.toCharArray())
		{
		    set.add(c);
		}
		int count=0;
		for(char ch:s1.toCharArray())
		{
		    if(set.contains(ch))
		    {
		        count++;
		    }
		}
        System.out.print(count);
	}
}
