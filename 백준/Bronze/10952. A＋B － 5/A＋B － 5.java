import java.io.*;
public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        while(true)
        {
            String num = br.readLine();
            int index = num.indexOf(" ");
            int A = Integer.parseInt(num.substring(0,index));
            int B = Integer.parseInt(num.substring(index + 1));
            if(A == 0 && B == 0)
            {
                break;
            }
            bw.write(A + B + "\n");
        }
        br.close();
        bw.close();
    }
}