import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        for (int n = 0; n < num; n++) {
            int R = sc.nextInt();  // 반복 횟수 R
            String S = sc.next();  // 문자열 S
            
            for (int i = 0; i < S.length(); i++) {
                for (int j = 0; j < R; j++) {
                    System.out.print(S.charAt(i)); 
                }
            }
            System.out.println(); 
        }
        
        sc.close(); // Scanner 닫기
    }
}
