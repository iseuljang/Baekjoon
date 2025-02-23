import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int maxN = Math.max(arr[0], Math.max(arr[1], arr[2]));
        System.out.println(arr[0] + arr[1] + arr[2] - maxN > maxN 
                           ? arr[0] + arr[1] + arr[2] 
                           : (arr[0] + arr[1] + arr[2] - maxN) * 2 - 1);
        br.close();
    }
}