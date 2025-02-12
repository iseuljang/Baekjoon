import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            int n = sc.nextInt();
            if (n == -1) break;

            StringBuilder sb = new StringBuilder();
            int sum = 0;

            for(int i = 1; i < n; i++) {
                if(n % i == 0) {
                    sum += i;
                    sb.append(i).append(" + ");
                }
            }

            System.out.println(sum == n 
                               ? n + " = " + sb.substring(0, sb.length() - 3) 
                               : n + " is NOT perfect.");
        }

        sc.close();
    }
}