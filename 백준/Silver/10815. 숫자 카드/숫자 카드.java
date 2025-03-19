import java.io.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bf.readLine());
        HashMap<Integer, Boolean> arrn = new HashMap<>();
        for(String x : bf.readLine().split(" ")) arrn.put(Integer.parseInt(x), true);

        int m = Integer.parseInt(bf.readLine());
        for(String y : bf.readLine().split(" ")) 
            bw.write((arrn.containsKey(Integer.parseInt(y)) ? "1 " : "0 "));

        bw.flush();
        bw.close();
    }
}