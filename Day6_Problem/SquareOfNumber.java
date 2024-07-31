package Day6_Problem;

import java.util.Scanner;

interface CalculateSquare{
    int square(int number);

    default void printRes(int a , int b){
        System.out.println("The square of " + a +" is "+ b);
    }
}

public class SquareOfNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CalculateSquare calculateSquare = number -> number * number;

        int inputNumber = sc.nextInt();
        int square = calculateSquare.square(inputNumber);

        calculateSquare.printRes(inputNumber , square);

    }
}
