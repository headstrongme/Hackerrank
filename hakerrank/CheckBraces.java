package hakerrank;
import java.util.Stack;
/**
 *
 * @author sarthak
 */
public class CheckBraces {
    public static void main(String[] args) {
        String s = new String("[[{}]][{]}");
        
        int l= s.length();
       
        System.out.println( CheckBraces.balanced(l, s)? true :false);   
    }
    
    private static boolean checkEqual(char c, char p) {
        
        if(c=='(' && p==')') return true;
        if(c=='{' && p=='}') return true;
        if(c=='[' && p==']') return true;
        else  return false;
    }
    public static boolean balanced(int l, String s)
    {
        
         Stack<Character> st = new Stack();
         for(int i = 0 ; i<l;i++){
            if(s.charAt(i)== '(' ||s.charAt(i)== '[' || s.charAt(i)== '{' ){
                st.push(s.charAt(i));            
            }
            
            if(s.charAt(i)== ')' ||s.charAt(i)== ']' || s.charAt(i)== '}' ){
              
                if(checkEqual( st.peek(), s.charAt(i))){
                
                   char t = st.pop();
                   continue;
                }
                
            }
            
        }
         return (st.empty())?  true: false;
    }
    
    
}
