
package hakerrank;

import java.util.ArrayList;
import java.util.HashMap;

// Prolem is to find Permutation of Plaindrome
public class PalindromePermutation {
  public static  boolean isPal(String s){

s= s.replaceAll("\\s+", "");
s=s.toLowerCase();

HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
ArrayList<Integer> al= new ArrayList<Integer>();

for(int i=0;i<s.length();i++){
char c= s.charAt(i);

	if(hm.containsKey(c)){

		hm.put(c,(hm.get(c)+1));
	}
	else{
	hm.put(c,1);
	}
}
        int count=0;
	for(int j=0;j<s.length();j++){
	char c= s.charAt(j);
		if(hm.get(c)%2==1){
		//int count =hm.get(i)
		al.add(hm.get(c));
		}

	}	
	     System.out.println(hm);
	if(al.size() == 1)
	{
	return true;
	}
	else{
	return false;
	}

}
    
    
    public static void main(String args[]){
        System.out.println(isPal("Taco catt"));
        
    }
    
}
