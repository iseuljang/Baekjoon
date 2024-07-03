import java.io.*;
import java.util.*;
public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());  // 배열원소갯수
        int X = Integer.parseInt(st.nextToken());  // 기준숫자
        int[] arr = new int[N];
        
        st = new StringTokenizer(br.readLine()," ");
        
        for(int i = 0; i < N; i++)
        {
            arr[i] = Integer.parseInt(st.nextToken());
            if(arr[i] < X)
            {
                System.out.print(arr[i] + " ");
            }
        }
    }
}