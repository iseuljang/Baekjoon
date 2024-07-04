import java.io.*;
import java.util.*;
public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int max = 0;
        if(a != b && a != c && b != c)
        {   //모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원
            max = Math.max(a, Math.max(b,c));
            System.out.print(max * 100);
        }else if(a == b && a == c)
        {   //같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원
            System.out.print(10000 + a * 1000);
        }else if(a == b || a == c)
        {   //같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원
            System.out.print(1000 + a * 100);
        }else
        {   // b == c
            System.out.print(1000 + b * 100);
        }
    }
}