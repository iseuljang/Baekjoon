import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int y = 1; y <= 9; y++)
        {
            System.out.printf("%d * %d = %d\n",x,y,(x*y));
        }
    }
}