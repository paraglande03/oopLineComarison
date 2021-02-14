import java.util.Scanner;

public class LineCalculation {

    double x1,x2,y1,y2;
    public void values(){
        System.out.println("Enter values of points");

        Scanner point = new Scanner(System.in);
        x1=point.nextDouble();
        x2=point.nextDouble();
        y1=point.nextDouble();
        y2=point.nextDouble();
        System.out.println("Points are: ("+x1+","+x2+")"+"("+y1+","+y2+")");
    }

    public void calculation(){
        double length;
        length=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y2));
        System.out.println("length=" + length);

    }
}
