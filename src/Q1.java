import java.util.*;

public class Q1 {


  public static void main (String[] args) {


    Scanner in = new Scanner(System.in);

    System.out.println("Input an int");

    int intValue = in.nextInt();

    System.out.printf("Octal: %o\n", intValue);
    System.out.printf("Hex: %x\n", intValue);

    String binaryValue = Integer.toBinaryString(intValue);

    System.out.println("Binary: " + binaryValue);


    float reciprocal = (float) 1.0 / intValue;

    System.out.printf("Reciprocal: %f\n", reciprocal);

  }


}
