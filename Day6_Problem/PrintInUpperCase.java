package Day6_Problem;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class PrintInUpperCase {

    public static void main(String[] args) {
      List<String> nameList = Arrays.asList("Akhil","Maurya","Aditya","Shukla","Ruksar","Shaikh");
      Consumer<String>  upperCase  = name -> System.out.println(name.toUpperCase());
      nameList.forEach(upperCase);
    }
}


