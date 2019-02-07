package hakerrank;
import java.util.*;
/**
 *
 * @author sarthak
 */
public class ReverseString {
    public static void main(String[] args) {
        String reverse = "";
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        
        for (int i=input.length()-1; i>=0; i--)
        {
            reverse = reverse + input.charAt(i);
        }
        System.out.println(reverse);
    }
}
//StringBuilder 

