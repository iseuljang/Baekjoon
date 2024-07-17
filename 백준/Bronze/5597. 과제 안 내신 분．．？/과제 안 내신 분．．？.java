import java.io.*;
public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[31];
        for(int i = 1; i <= 28; i++)
        {
            int a = Integer.parseInt(br.readLine());
            arr[a] = 1;
        }
        
        for(int j = 1; j <= 30; j++)
        {
            if(arr[j] != 1)
            {
                System.out.println(j);
            }
        }
    }
}