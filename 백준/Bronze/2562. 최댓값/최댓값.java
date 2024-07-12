import java.io.*;
public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] num = new int[9];
        int max = 0;
        int index = 0;
        int count = 0;
        for(int i = 0; i < 9; i++)
        {
            num[i] = Integer.parseInt(br.readLine());
        }
        
        for(int number : num)
        {
            count++;
            if(number > max)
            {
                max = number;
                index = count;
            }
        }
        System.out.println(max);
        System.out.println(index);
        br.close();
    }
}