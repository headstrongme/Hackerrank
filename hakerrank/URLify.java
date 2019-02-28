
package hakerrank;

//Task is to replace spaces with "%20" in a String 
public class URLify {
    
  public static  String uRLifya(String s, int a){

char [] schar = s.toCharArray();

StringBuilder sb = new StringBuilder();

String val = "%20";

for(int i=0; i<a;i++){
 if(schar[i]==' ')
 {
 sb.append(val);
 }
 else{
 sb.append(schar[i]);
 }
 
}

return sb.toString();
}
    
    
    public static void main(String[] args) {
        String a="Hello World  is that ok";
        
        System.out.println(uRLifya(a,a.length()));
    }
    
}
