import java.io.*;
public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
        String num;
        while((num = br.readLine()) != null)
        {
            int index = num.indexOf(" ");
            int A = Integer.parseInt(num.substring(0,index));
            int B = Integer.parseInt(num.substring(index + 1));
            System.out.println(A + B);
        }
        br.close();
    }
}