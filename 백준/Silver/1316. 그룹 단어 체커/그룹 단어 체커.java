import java.util.Scanner;
public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int count = 0;
        int N = in.nextInt();
        for(int i = 0; i < N; i++) {
            if(isGroupWord(in.next())) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean isGroupWord(String str) {
        boolean[] seen = new boolean[26];
        char prev = '\0';  // 초기값으로 아무 문자도 없는 상태를 의미

        for(char current : str.toCharArray()) {
            if(current != prev) { // 이전 문자와 다를 때만 체크
                if(seen[current - 'a']) {
                    return false; // 이미 나온 문자인 경우 그룹 단어 아님
                }
                seen[current - 'a'] = true;
            }
            prev = current; // 이전 문자를 현재 문자로 업데이트
        }
        return true;
    }
}