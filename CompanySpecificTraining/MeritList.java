package CompanySpecificTraining;
import java.util.*;
public class MeritList {
    static int arr[];
    public static int call(int x,int y,int n){
        arr[x]=y;
        int count=1;
        for(int i=1;i<n;i++)
        {
            if(arr[i]!=arr[i-1])
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<k;i++)
        {
            int x=sc.nextInt()-1;
            int y=sc.nextInt();
            System.out.println(call(x,y,n));

        }
        sc.close();
    }
}
/*John, a strict math teacher, is monitoring N students taking an exam. The students' marks are stored in array M[1...N]. If two adjacent students (i and i+1) have equal marks, then the one sitting behind (i+1) is marked as a cheater and removed from the merit list.

After the initial marks are recorded, there are K re-evaluations, where a student's mark is updated at a given index. After each re-evaluation, the new merit list is recalculated and the number of valid (non-cheating) students is printed.

✍️ Example (Explained):
Initial marks:
M = [1, 1, 2, 5, 2]
Re-evaluations:

1 3 → change M[1] to 3 → M = [3, 1, 2, 5, 2]

No adjacent students have the same mark. ✔️ All students are valid → Output: 5

4 2 → change M[4] to 2 → M = [3, 1, 2, 2, 2]

M[3] = M[4] = 2 → M[4] is out

Now M[4] = M[5] = 2 → M[5] is also out

Remaining: M[1], M[2], M[3] → Output: 3 */