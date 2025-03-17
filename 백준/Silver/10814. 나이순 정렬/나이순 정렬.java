import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[][] arr = new String[N][2];

        for (int i = 0; i < N; i++) {
            arr[i][0] = sc.next(); // 나이
            arr[i][1] = sc.next(); // 이름
        }

        Arrays.sort(arr, (a, b) -> Integer.compare(Integer.parseInt(a[0]), Integer.parseInt(b[0])));

        for (String[] a : arr) System.out.println(a[0] + " " + a[1]);
    }
}