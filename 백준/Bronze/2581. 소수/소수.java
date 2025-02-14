import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        boolean[] prime = new boolean[N + 1];

        prime[0] = prime[1] = true;
        for(int i = 2; i * i <= N; i++) {
            if(!prime[i]) {
                for(int j = i * i; j <= N; j += i) prime[j] = true;
            }
        }

        int sum = 0, min = Integer.MAX_VALUE;
        for(int i = M; i <= N; i++) {
            if(!prime[i]) {
                sum += i;
                if(min == Integer.MAX_VALUE) min = i;
            }
        }

        System.out.println(sum == 0 ? -1 : sum + "\n" + min);
    }
}