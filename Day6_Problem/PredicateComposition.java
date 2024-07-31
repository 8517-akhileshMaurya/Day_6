package Day6_Problem;

import java.util.Arrays;
import java.util.List;

public class PredicateComposition {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Akhil", "Aditya", "Ruksar", "Smit");
        list.stream().filter(str -> str.length() > 5 && str.contains("A")).forEach(System.out::println);
    }

}