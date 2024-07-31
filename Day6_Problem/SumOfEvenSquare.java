package Day6_Problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SumOfEvenSquare {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);

        // even -> sq -> sum

        int evenNumber = list.stream()
                .filter(n->n%2==0).map( n -> n*n).reduce(0, (sum,n)->sum+n);



        System.out.println(evenNumber);
    }
}
