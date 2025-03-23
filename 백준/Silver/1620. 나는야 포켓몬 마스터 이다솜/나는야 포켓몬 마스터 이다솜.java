import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        List<String> list = new ArrayList<>(N + 1);
        list.add(""); //인덱스 1부터 사용 (더미 데이터)
        HashMap<String, Integer> map = new HashMap<>();

        for(int i = 1; i <= N; i++) {
            String name = br.readLine();
            list.add(name);
            map.put(name, i);
        }

        StringBuilder sb = new StringBuilder();
        while (M-- > 0) {
            String query = br.readLine();
            if(Character.isDigit(query.charAt(0))) { //숫자인지 확인
                sb.append(list.get(Integer.parseInt(query))).append("\n");
            }else {
                sb.append(map.get(query)).append("\n");
            }
        }
        System.out.print(sb);
    }
}