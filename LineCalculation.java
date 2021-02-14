import java.util.Scanner;

public class LineCalculation {

    double x1,x2,y1,y2;
    double length;
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
        double length1, length2;
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

            if(length1==length2){
                System.out.println("Lines are equal");
            }
            else{
                System.out.println("Lines are not equal");
            }


    }
}
