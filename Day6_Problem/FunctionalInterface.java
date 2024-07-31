package Day6_Problem;

//Write a program to implement a custom functional interface that takes two integer inputs
//        and returns their sum using lambda expressions

interface returnSum{
    void sum(int a , int b);
}

public class FunctionalInterface  {
    public static void main(String[] args) {

        returnSum obj = (a , b) -> System.out.println(a+b);
        obj.sum(4,5);

    }


}
