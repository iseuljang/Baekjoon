import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] list = new int[T];
        for(int i = 0; i < T; i++)
        {
            int A = sc.nextInt();
            int B = sc.nextInt();
            list[i] = A + B;
        }
        
        for(int i : list)
        {
            System.out.println(i);
        }
    }
}