import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] bl = new boolean[42];
        
        int count = 0;
        for(int i = 0; i < 10; i++)
        {
            bl[Integer.parseInt(br.readLine()) % 42] = true;
        }
        
        for(boolean list : bl)
        {
            if(list)
            {
                count++;
            }
        }
        System.out.print(count);
    }
}
