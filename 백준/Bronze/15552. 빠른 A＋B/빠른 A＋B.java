import java.io.*;
public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < T; i++)
        {
            String num = br.readLine();
            int index = num.indexOf(" ");
            bw.write((Integer.parseInt(num.substring(0,index)) + Integer.parseInt(num.substring(index + 1))) + "\n");
        }
        br.close();
        bw.close();
    }
}