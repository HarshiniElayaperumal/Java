//Using StringBuilder
/*package string;
import java.util.*;
public class reverseWords {
    public static String revWords(String str)
    {
        String[] parts=str.split("\\.");
        StringBuilder sb=new StringBuilder();
        for(int i=parts.length-1;i>=0;i--)
        {
            if(!parts[i].isEmpty())
            {
                if(sb.length()>0) sb.append(".");
                sb.append(parts[i]);
            }
        }
        return sb.toString();

    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(revWords(str));
    }
}
*/

//Using ArrayList
package string;
import java.util.*;
public class reverseWords {
    public static String revWords(String str)
    {
        ArrayList<String> arr=new ArrayList<>();
        String[] parts=str.split("\\.");
        for(String word:parts)
        {
            if(!word.isEmpty())
            arr.add(word);
        }
        Collections.reverse(arr);
        return String.join(".",arr);

    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(revWords(str));
    }
}
