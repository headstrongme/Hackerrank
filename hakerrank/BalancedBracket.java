
package hakerrank;

import java.util.Stack;

public class BalancedBracket {
    public static void main(String[] args) {
        
        String s = new String("[]{}");
        Stack<Character> stk = new Stack<Character>();
        int len = s.length();

for(int i =0;i<len;i++){
  switch(s.charAt(i)){
      case '{':
      case '[':
      case '(':
          stk.push(s.charAt(i));
      break;
      case']':
      if(stk.isEmpty() || stk.peek()!='['){
          System.out.println("NO");
          break;
      }
      stk.pop();
      case')':
      if(stk.isEmpty() || stk.peek()!='('){
          System.out.println("NO");
          break;
      }
      stk.pop();
      case'}':
      if(stk.isEmpty() || stk.peek()!='{'){
          System.out.println("NO");
          break;
      }
      stk.pop();
      break;
  }

}
        
if (stk.isEmpty()){
    System.out.println("TRUE");
}
else{
    System.out.println("FALSE");
}

    }
}
