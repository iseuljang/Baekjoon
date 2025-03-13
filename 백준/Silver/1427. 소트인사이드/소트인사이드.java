import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] count = new int[10];

        for(int N = sc.nextInt(); N > 0; N /= 10) count[N % 10]++;

        for(int i = 9; i >= 0; i--) while (count[i]-- > 0) System.out.print(i);
    }
}