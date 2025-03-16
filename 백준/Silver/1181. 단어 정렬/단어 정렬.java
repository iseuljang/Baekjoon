import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] arr = new String[N];

        sc.nextLine();
        for(int i = 0; i < N; i++) arr[i] = sc.nextLine();

        Arrays.sort(arr, (s1, s2) -> s1.length() == s2.length() 
                    ? s1.compareTo(s2) 
                    : s1.length() - s2.length());

        System.out.println(arr[0]);
        for(int i = 1; i < N; i++) if (!arr[i].equals(arr[i - 1])) System.out.println(arr[i]);
    }
}
