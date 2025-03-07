import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        if(N == 4 || N == 7) System.out.println(-1);
        else System.out.println((N % 5 == 0) 
                                ? N / 5 
                                : (N / 5) + ((N % 5 == 1 || N % 5 == 3) 
                                             ? 1 
                                             : 2));
    }
}