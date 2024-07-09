import java.io.*;
public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String num = br.readLine();
        int sum = 0;
        for(int i = 0; i < N; i++)
        {
            sum += Character.getNumericValue(num.charAt(i));
        }
        System.out.print(sum);
        br.close();
    }
}