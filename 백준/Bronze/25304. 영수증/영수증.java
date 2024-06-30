import java.io.*;
public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine()); // 총 금액
        int N = Integer.parseInt(br.readLine()); // 물건의 종류의 수
        int total = 0;
        for(int i = 1; i <= N; i++)
        {
            String num = br.readLine();
            int index = num.indexOf(" ");
            int a = Integer.parseInt(num.substring(0,index));
            int b = Integer.parseInt(num.substring(index + 1));
            total += a * b;
        }
        
        if(X == total)
        {
            System.out.print("Yes");
        }else
        {
            System.out.print("No");
        }
    }
}