import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 10진수 숫자
        int B = Integer.parseInt(st.nextToken()); // 변환할 진법

        br.close();

        StringBuilder sb = new StringBuilder();

        while (N > 0) { // N이 0이 될 때까지 반복
            int remainder = N % B;
            sb.append(remainder < 10 ? (char) (remainder + '0') : (char) (remainder - 10 + 'A'));
            N /= B;
        }

        System.out.println(sb.reverse()); // 결과를 뒤집어서 출력
    }
}