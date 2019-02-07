/*
The count-and-say sequence is the sequence of integers beginning as follows:
1, 11, 21, 1211, 111221, ...
1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.
*/
package hakerrank;
/**
 *
 * @author sarthak
 */
public class countAndSay {
    public static void main(String[] args) {
        
        //n is length of sequence 
        int n=5,count=0;
        StringBuilder str= new StringBuilder ("1");
        StringBuilder temp = new StringBuilder();
        
        for(int i=1;i<n;i++){
           count =1;
           char ch =str.charAt(0);
           for(int j = 1; j < str.length();j++){
               if(ch != str.charAt(j)){
                   temp.append(count).append(ch);
                   count=1;
                   ch= str.charAt(j);
               }
               else{
                   count++;
               }
           }
           temp.append(count).append(ch);
           str=temp;
           temp = new StringBuilder();
        }
        System.out.println(str);
        
    }
}
