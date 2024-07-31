package Day6_Problem;

import java.util.function.BiFunction;

public class BIFunctionalString {
    public static void main(String[] args) {

        BiFunction<String , String, String> concatenateString = (s1 , s2) -> s1 + " " + s2 ;

        String input1 = "Hii";
        String input2 = "Akhil";
        String res = concatenateString.apply(input1 , input2);
        System.out.println(res);
    }
}
