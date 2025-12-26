import java.util.Scanner;

public class minPageFlip {
    public static int countPage(int n,int p)
    {
        int front=p/2;
        int back=(n/2)-(p/2);
        return Math.min(front,back);
    }
    public static void main(String[] args)
    {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        System.out.println(countPage(n, p));
    }
}
// https://www.placementpreparation.io/tcs-digital/advanced-section/advanced-coding/