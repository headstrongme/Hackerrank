
package hakerrank;

import java.util.HashMap;

/**
 *
 * @author sarthak
 */
public class findRecurring {
    public static void main(String args []){
        String  str= "ABCBA";
        
        System.out.println(findRecurring.recurring(str));
                
    }
    public static String recurring(String s){
        HashMap <Character, Integer> hm= new HashMap<Character, Integer>();
        for(int i=0;i<s.length();i++){
            if( hm.containsKey(s.charAt(i))){
                return s.charAt(i) + " :is the recurring char";
            }
            
            hm.put((s.charAt(i)), 1);
        }
        return "No recurring char found";
    }
}
