import java.util.*;

public class Q2{


  public static void main (String[] args) {


    System.out.println("Input angle");
    Scanner in = new Scanner(System.in);

    int angle = in.nextInt();

    int normalizedAngle = angle % 360;

    if (normalizedAngle < 0) {
      normalizedAngle += 360;
    }

    System.out.println(normalizedAngle);




  }




}
