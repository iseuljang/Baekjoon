import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(), result = 0;

        for(int i = 0; i < N; i++) {
            int sum = i, num = i;
            while(num > 0) {
                sum += num % 10;
                num /= 10;
            }
            if(sum == N) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
