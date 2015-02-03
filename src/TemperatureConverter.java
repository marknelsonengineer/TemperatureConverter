/**
 * Created by mark on 2/2/15.
 */
public class TemperatureConverter {
  public static void main(String[] args) {
    // System.out.printf( "0=%s  1=%s\n", args[0],args[1] );

    if( args.length != 2 ) {
      throw new IllegalArgumentException();
    }

    if( !(args[0].equals("-F") || args[0].equals("-C"))) {
      throw new IllegalArgumentException();
    }

    int inVal = Integer.parseInt( args[1]);

    if( args[0].equals("-F")) {
      System.out.printf("%d Farenheit is %d Celsius\n", inVal, (inVal-32)*5/9 );
    } else {
      System.out.printf("%d Celisus is %d Farenheit\n", inVal, (inVal*9/5)+32 );
    }

  }
}
