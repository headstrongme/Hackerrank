
package hakerrank;

/**
 *
 * @author sarthak
 */
public class TimeConversion {

    public static String timeConversion(String s) {
        
        
        // we did not cosider case sesitivity thats why it is not passing all test
        String array[] = s.split(":");
        int hh,mm,ss;
        hh=Integer.parseInt(array[0]);
      //  mm=Integer.parseInt(array[1]);
       // ss=Integer.parseInt(array[2]);
      if((hh==12)&& (s.toLowerCase().charAt(8)== 'a')){
          hh=00;
      }else if((s.toLowerCase().charAt(8)=='p') && (hh!=12)){
          hh=hh+12;
      }
      String temp =  hh + "";
      String temp2 = temp + s.substring(2,8);

        return temp2;
    }




    public static void main(String[] args) {
        String s = "12:40:22AM";
        
        String result = timeConversion(s);

        System.out.println(result);
    }





}
