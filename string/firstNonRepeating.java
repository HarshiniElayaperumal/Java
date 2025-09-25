package string;
import java.util.*;
public class firstNonRepeating {
    public static char findChar(String str)
    {
        LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
        for(char ch:str.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet())
        {
            if(entry.getValue()==1)
            return entry.getKey();
        }
        return '$';

    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(findChar(str));
    }
}
