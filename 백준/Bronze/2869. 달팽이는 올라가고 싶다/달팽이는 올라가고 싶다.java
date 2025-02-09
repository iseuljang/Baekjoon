import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int up = sc.nextInt();
        int down = sc.nextInt();
        int length = sc.nextInt();
        System.out.println( ((length - down) % (up - down) == 0) 
                           ? (length - down) / (up - down) 
                           : (length - down) / (up - down) + 1);
    }
}