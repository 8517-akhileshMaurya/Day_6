package Day6_Problem;

import java.util.Arrays;
import java.util.List;

public class FilteringAList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Akhil" , "Manish" , "Ankit" , "Aditya");

        System.out.println("Name Start with 'A' : ");
        list.stream().filter(name -> name.startsWith("A"))
                .forEach(System.out::println);
    }
}
