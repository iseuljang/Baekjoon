import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        
        int N = sc.nextInt();
        while (N-- > 0) list.add(sc.nextInt());

        Collections.sort(list);

        for (int num : list) System.out.println(num);
    }
}