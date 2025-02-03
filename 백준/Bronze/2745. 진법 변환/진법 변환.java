import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());
        int sum = 0;
        int tmp = 1;

        for (int i = N.length() - 1; i >= 0; i--, tmp *= B) 
            sum += (N.charAt(i) >= 'A' ? N.charAt(i) - 'A' + 10 : N.charAt(i) - '0') * tmp;

        System.out.println(sum);
    }
}