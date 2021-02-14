import java.util.Scanner;

public class LineCalculation {

    double x1,x2,y1,y2;
    double length;
    double length1, length2;
    public void values(){
        System.out.println("Enter values of points");

        Scanner point = new Scanner(System.in);
        x1=point.nextDouble();
        x2=point.nextDouble();
        y1=point.nextDouble();
        y2=point.nextDouble();
        System.out.println("Points are: ("+x1+","+x2+")"+"("+y1+","+y2+")");
    }

    public double calculation(){

        length=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y2));
        return length;

    }
    public void EqualCheck(){

        System.out.println("For line 1:---");
        values();
        calculation();
        length1=length;
        System.out.println("length of line 1="+length1);
        System.out.println("For line 2:---");
        values();
        calculation();
        length2=length;
        System.out.println("length of line 2="+length2);




    }
    public void Compare(){
        Integer L1=(int)length1;
        Integer L2=(int)length2;
        if (L1<L2){
            System.out.println("Line 2 is greater than line 1 ");
        }
        else if (L1>L2){
            System.out.println("Line 1 is greater than line 2 ");
        }
        else {
            System.out.println("Both the lines are equal");
        }
    }
}
