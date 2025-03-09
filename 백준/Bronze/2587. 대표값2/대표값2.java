import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0, arr[] = new int[5];

        for(int i = 0; i < 5; i++) sum += (arr[i] = Integer.parseInt(br.readLine()));

        Arrays.sort(arr);
        System.out.print((sum / 5) + "\n" + arr[2]);
    }
}