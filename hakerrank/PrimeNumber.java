
package hakerrank;
import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numInput = scan.nextInt();
        Boolean flag = true;
        int temp;
        
        for(int i=2; i<=(numInput/2); i++)
        {
            temp= numInput%i;
            
            if(temp==0)
            {
                flag=false;
            }
        }
        
        if (flag)
        {
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
}
