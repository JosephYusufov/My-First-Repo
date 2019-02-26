import java.util.Scanner;

public class UserOfPoint{
  public static void main(String[] commandLine) {
    double distanceFromOrigin;
    int degreesFromXaxis;
    Scanner s0;

    s0 = new Scanner(System.in);

    System.out.println("Distance from Origin?");
    distanceFromOrigin = Integer.parseInt(s0.next());
    System.out.println("Degrees from X-axis?");
    degreesFromXaxis = Integer.parseInt(s0.next());
    System.out.println("********************");
    System.out.println("********************");
    System.out.println("********************");


    Point p0;
    p0 = new Point();

    p0.xcor = distanceFromOrigin * Math.cos((Math.PI/180) * degreesFromXaxis);
    p0.ycor = distanceFromOrigin * Math.sin((Math.PI/180) * degreesFromXaxis);

    System.out.println("Distance From Origin = " + distanceFromOrigin);
    System.out.println("Degrees From X-axis = " + degreesFromXaxis);

    System.out.println("x cor = " + p0.xcor);
    System.out.println("y cor = " + p0.ycor);
  }
}
/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
TARENCE
* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */
