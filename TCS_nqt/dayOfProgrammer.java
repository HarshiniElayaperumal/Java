import java.util.*;
public class dayOfProgrammer {
    public static String dprogrammer(int year)
    {
        String date;
        if(year==1918)
        return "26.09.1918";
        else if(year>=1700 && year<=1917){
            if(year%4==0)
            date="12.09."+year;
            else
            date="13.09."+year;            
        }
        else
        {
            if(year%400==0 || (year%4==0 && year%100!=0))
            date="12.09."+year;
            else
            date="13.09."+year;
        }
        return date;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        System.out.println(dprogrammer(year));
    }
}

// https://www.placementpreparation.io/tcs-digital/advanced-section/advanced-coding/