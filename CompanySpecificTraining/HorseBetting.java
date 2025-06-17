package CompanySpecificTraining;
import java.util.*;

public class HorseBetting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of horses
        int k = sc.nextInt(); // reward amount (Bob will bet less than this)
        int[] arr = new int[n]; // betting prices
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int start = 0, sum = 0, ans = 0;

        for (int end = 0; end < n; end++) {
            sum += arr[end];

            while (sum >= k && start <= end) {
                sum -= arr[start];
                start++;
            }

            ans = Math.max(ans, end - start + 1);
        }

        System.out.println(ans);
        sc.close();
    }
}
/*Horse Betting Puzzle
Problem Statement:

Bob is going to bet on horse riding. There are N horses, listed in a sequence from 1 to N. Each horse has a betting price, and Bob wants to bet on a continuous sequence of horses. If any one of those horses wins, Bob wins the reward.

Bob will get K units of reward if any of his bets win. However, since Bob is wise, he only wants to invest less than K units of his own money. His goal is to bet on as many horses as possible, i.e., maximize the length of the continuous sequence whose total betting price is less than K.

If there are multiple such sequences with the same maximum length, Bob may choose any.

Input Format:
First line: Two integers N (number of horses) and K (reward money)

Second line: N integers representing the price to bet on each horse in order.

Output Format:
A single integer — the maximum number of horses Bob can bet on in a continuous sequence such that the total price is strictly less than K.

Constraints:
2 ≤ N ≤ 105

1 ≤ K ≤ 109

1 ≤ A1, A2, ..., AN ≤ 109 (betting prices)

Example 1:
Input:

Copy
Edit
10 100
30 40 50 20 20 10 90 10 10 10
Output:

Copy
Edit
3
Explanation:
There are multiple sequences with a total cost < 100. Two of length 3: [50,20,20] and [10,10,10]. Bob will choose randomly among them. So the answer is 3.

 */