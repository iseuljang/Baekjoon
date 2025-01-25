import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        int count = 0;

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(i < str.length() - 1) {
                String nextTwo = str.substring(i, i + 2);

                if(nextTwo.equals("c=") || nextTwo.equals("c-") || nextTwo.equals("d-") || 
                    nextTwo.equals("lj") || nextTwo.equals("nj") || nextTwo.equals("s=") || 
                    nextTwo.equals("z=")) {
                    i++; // 다음 문자 건너뜀
                }else if (i < str.length() - 2 && str.substring(i, i + 3).equals("dz=")) {
                    i += 2; // "dz=" 처리
                }
            }
            count++;
        }
        System.out.println(count);
    }
}