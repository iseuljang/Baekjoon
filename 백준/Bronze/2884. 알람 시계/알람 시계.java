import java.io.*;
public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String time = br.readLine();
        int index = time.indexOf(" ");
        int H = Integer.parseInt(time.substring(0,index));   // 시간 
        int M = Integer.parseInt(time.substring(index + 1)); // 분
        
        if(M < 45)
        {
            H--;
            M = 60 - (45 - M);
            if(H < 0)
            {
                H = 23;
            }
            System.out.print(H + " " + M);
        }else
        {
            System.out.print(H + " " + (M - 45));
        }
    }
}