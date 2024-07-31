package Day6_Problem;

import java.util.Scanner;

@java.lang.FunctionalInterface
interface AreaCircle{

    double radious(double radious);

    default void Area(double a, double b){
        System.out.println("Area of circle with radious " + a +" is " + b);
    }
}

public class AreaOfCircle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        AreaCircle areaCircle = number -> Math.PI * number * number;

        double Radious = sc.nextInt();
        double Area = areaCircle.radious(Radious);

        areaCircle.Area(Radious , Area);

    }
}
