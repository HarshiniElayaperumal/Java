package CompanySpecificTraining;
import java.util.*;
public class GoldenHouse {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int start=0,sum=0;
        for(int end=0;end<n;end++)
        {
            sum+=arr[end];
            while(sum>k && start<=end)
            {
                sum-=arr[start];
                start++;
            }
            if(sum==k)
            {
                System.out.println((start+1)+" "+(end+1));
                break;
            }
        }
        sc.close();
    }
}

/*Golden House Puzzle
Problem Statement:

This vacation, you went to visit the golden house. There are N rooms in this golden house, and its owner needs someone to take care of the management of this house. As you have been unemployed for a long time, you are interested in this job.

The owner of the house wants an intelligent manager for this role, so he created a puzzle. The person who solves this puzzle will become the manager of the golden house.

Puzzle:
The owner has placed a number of gold coins in each room.

You have to choose two rooms:

One where you enter the house (starting room).

One where you exit the house (ending room).

From any room, you can either exit or move to the next room. While visiting any room, you must collect all the gold coins — you can't skip collecting coins.

The owner wants you to collect exactly K coins when you exit the house.

He guarantees that there will be at least one solution for this puzzle.

Task:
Given:

Number of rooms N

Total required gold coins K

An array of size N representing the number of gold coins in each room.

You need to find the indices (1-based) of the rooms from where you will start and end so that the total number of collected coins is exactly K.

If there are multiple such subsequences, return the one with the smallest starting room number.

Hint:
Find a continuous subsequence whose sum is exactly equal to K.
Example:
Input:
Copy
Edit
10 15
5 3 7 14 18 1 18 4 8 3
Output:
Copy
Edit
1 3
Explanation:
There are two sequences with total 15:

Rooms 1 to 3: 5 + 3 + 7 = 15

Rooms 8 to 10: 4 + 8 + 3 = 15

Since the first one starts earlier, we choose [1, 3]. */