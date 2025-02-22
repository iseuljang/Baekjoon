import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if(arr[0] == 0 && arr[1] == 0 && arr[2] == 0) break;
            Arrays.sort(arr);
            System.out.println(arr[2] >= arr[0] + arr[1] 
                               ? "Invalid" 
                               : arr[0] == arr[2] 
                                   ? "Equilateral" 
                                   : arr[0] == arr[1] || arr[1] == arr[2] 
                                       ? "Isosceles" 
                                       : "Scalene");
        }
    }
}