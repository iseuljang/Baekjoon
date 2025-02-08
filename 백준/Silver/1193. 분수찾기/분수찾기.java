import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine()); // 입력값 X

        int cross = 1;  // 현재 대각선의 개수
        int sum = 0;    // 이전 대각선까지의 총 개수 합

        // X가 속한 대각선 찾기
        while(X > sum + cross) {
            sum += cross;
            cross++;
        }

        int numerator, denominator;

        if(cross % 2 == 1) { // 홀수 번째 대각선 (↙ 방향)
            numerator = cross - (X - sum - 1);
            denominator = X - sum;
        }else { // 짝수 번째 대각선 (↗ 방향)
            numerator = X - sum;
            denominator = cross - (X - sum - 1);
        }

        System.out.println(numerator + "/" + denominator);
    }
}