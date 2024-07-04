import java.io.*;
import java.util.*;
public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] time = br.readLine().split(" "); 
        int A = Integer.parseInt(time[0]);       // 현재 시간
        int B = Integer.parseInt(time[1]);       // 현재 분
        int C = Integer.parseInt(br.readLine()); // 조리 시간
        B += C; //현재 시간에 조리시간을 더하고
        if(B >= 60)  // 60분을 넘어가면 시간에도 더해줘야 한다.
        {
            A += B / 60;
            B = B % 60;
            if(A >= 24)
            {
                A -= 24;
            }
        }
        System.out.print(A + " " + B);
    }
}