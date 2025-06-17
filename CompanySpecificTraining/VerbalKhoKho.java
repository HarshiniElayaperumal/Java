package CompanySpecificTraining;
import java.util.*;
public class VerbalKhoKho {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i=1;i<n;i++)
        {
            if(arr[i]!=arr[i-1])
            {
                count++;
            }
        }
        System.out.println(count);
        sc.close();

    }
}
/*Alice and her friends are playing a game of verbal Kho-Kho.

Alice gives a digit to the first friend, and each friend tries to pass it on to the next in order without speaking. The digit may get misunderstood by some friends. If all friends pass the digit correctly, all receive a T-shirt. If not, Alice will ask each friend what digit they received, and she will give T-shirts only to those who correctly understood the digit passed by the previous friend.

You're given:

An integer N – number of friends.

An array D of size N – where D[i] denotes the digit understood by the i-th friend.

Return the number of friends who misunderstood the digit they received from the previous friend (excluding the first friend, since they receive the digit directly from Alice).

 Input:
3
4 4 4
Output:
0
Input:
5
2 2 3 3 4
Output:
2*/