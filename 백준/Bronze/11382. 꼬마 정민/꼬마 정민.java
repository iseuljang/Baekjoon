import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        // int는 약 10의 9승까지 가능하기 때문에 long
        System.out.print(A + B + C);
    }
}
