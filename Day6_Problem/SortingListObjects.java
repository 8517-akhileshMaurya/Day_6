package Day6_Problem;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//Create a list of Person objects with attributes such as name, age, and salary. Sort the list
//by age in ascending order using lambda expressions.
class person {
    private String name;
    private int age;
    private int salary;

    public person(String name , int age , int salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

}

public class SortingListObjects {
    public static void main(String[] args) {

        List<person> People = new ArrayList<>();
        People.add(new person("Akhil" , 21 , 28000));
        People.add(new person("Smit" , 23 , 65000));
        People.add(new person("Aditya" , 21 , 29000));


        People.sort(Comparator.comparingInt(person :: getAge));

        System.out.println("Sorted list using Salary");
        for(person person : People){
            System.out.println(person);
        }




    }
}
