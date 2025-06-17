package CompanySpecificTraining;
import java.util.*;
public class StringGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        String B=sc.nextLine();
        StringBuilder C=new StringBuilder();
        for(int i=0;i<A.length();i++)
        {
            char ch=A.charAt(i);
            if(B.indexOf(ch)==-1)
            {
                C.append(ch);
            }
        }
        System.out.println(C.toString());
        sc.close();
    }
}
/*Take two strings A and B as input.

Remove all characters in B from A.

Output the remaining characters as string C.

Example from image:

makefile
Copy
Edit
Input:
A = "tiger"
B = "ti"
Output:
C = "ger"
Input:
A = "processed"
B = "esd"
Output:
C = "proc"
Input:
A = "tatent"
B = "tens"
Output:
C = "al" */