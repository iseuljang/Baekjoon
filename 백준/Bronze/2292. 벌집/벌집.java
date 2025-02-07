import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.close();

        int count = 1;
        int range = 2;
        
        while (N >= range) { 
            range += 6 * count++;
        }

        System.out.print(count);
    }
}