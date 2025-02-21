import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine()), b = Integer.parseInt(br.readLine()), c = Integer.parseInt(br.readLine());
        System.out.print((a + b + c != 180) ? "Error" : (a == b && b == c) ? "Equilateral" : (a == b || b == c || c == a) ? "Isosceles" : "Scalene");
    }
}