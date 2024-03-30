
package step3;
import java.util.StringTokenizer;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.lang.Math;
public class Compute {
  private void myThrowInvalidInput(){
    System.out.println("Invalid Input");
    System.exit(-1);
  }

  public void ComputeTo(){
    double a = 0, b = 0, c= 0, d = 0;
    String ss = new String();
    ss = Keyboard.getInput();
    // StringBuffer s[];
    /******** Begin ********/
    StringTokenizer st = new StringTokenizer(ss,";"); 

    if(st.countTokens()!=4){
      myThrowInvalidInput();
    }
    a = Double.parseDouble(st.nextToken());
    b = Double.parseDouble(st.nextToken());
    c = Double.parseDouble(st.nextToken());
    d = Double.parseDouble(st.nextToken());


    double result = Math.sin(a)*Math.cos(b)*Math.sqrt(Math.pow(c,d));
    System.out.printf("result=%.0f",result);

    /********  End  ********/
    
  }

  public static void main(String[] args){
    Compute a = new Compute();
    a.ComputeTo();
  }
}

