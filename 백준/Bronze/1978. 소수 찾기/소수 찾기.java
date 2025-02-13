import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;

        while(N-- > 0) {
            int num = sc.nextInt();
            if(num == 1) continue;

            boolean isPrime = true;
            for(int i = 2; i * i <= num; i++) {
                if(num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) count++;
        }
        System.out.println(count);
    }
}