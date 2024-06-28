import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        String B = sc.next();
        
        for(int i = 2; i >= 0; i--)
        {
            int one = Character.getNumericValue(B.charAt(i));            
            System.out.println(A * one);
        }
        System.out.println(A * Integer.parseInt(B));
	}

}