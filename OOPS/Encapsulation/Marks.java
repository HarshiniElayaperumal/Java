package OOPS.Encapsulation;

public class Marks {
    private int marks;

    public void setMarks(int m)
    {
        if(m>=0 && m<=100)
        {
            marks=m;
        }
    }
    public int getMarks()
    {
        return marks;
    }
}
