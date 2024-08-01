package Day_6_Project;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PolicyMain {
    public static void main(String[] args) {
        Policy policy1 = new Policy("123456" , "Akhil" , 1250.0);
        Policy policy2 = new Policy("135790" , "Aditya" , 1200.0);
        Policy policy3 = new Policy("234567" , "Nikhil" , 1050.0);
        Policy policy4 = new Policy("987654" , "Ruksar" , 1000.0);
        Policy policy5 = new Policy("654789" , "Shubham" , 2000.0);
        Policy policy6 = new Policy("456789" , "Smit" , 790.0);
        Policy policy7 = new Policy("098123" , "Sanjay" , 8763.0);
        Policy policy8 = new Policy("347898" , "Kuldeep" , 650.0);

        List<Policy> policies = new ArrayList<>();
        policies.add(policy1);
        policies.add(policy2);
        policies.add(policy3);
        policies.add(policy4);
        policies.add(policy5);
        policies.add(policy6);
        policies.add(policy7);
        policies.add(policy8);

        System.out.println("*********** 1 Sorted list using Premium Amount ************");
        policies.sort(Comparator.comparingDouble(Policy :: getPremiumAmount ));
        for(Policy person : policies){
            System.out.println(person);
        }

        System.out.println();

        System.out.println("*********** 2 Sorted list using holder name ************");
        policies.stream().sorted((Policy p1 , Policy p2)-> p1.getPolicyHolderName().compareTo(p2.getPolicyHolderName())).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println();

        System.out.println("******* 3 Total Primium amount ******");
        double totalPrimiun = policies.stream().mapToDouble(Policy :: getPremiumAmount).sum();
        System.out.println("Total amount : " + totalPrimiun);

        System.out.println();

        System.out.println("*******  4 View all Policy in Formated manner ******");
        policies.forEach(policy -> System.out.println(policy));

        System.out.println();

        System.out.println(" ********* 5  premium amount is  between $1,000 and $2,000 ***********");
        policies.stream().filter(policy -> policy.getPremiumAmount() >= 1000 && policy.getPremiumAmount() <=2000 ).collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println();

        System.out.println(" ******** 6 Get Maximum policy Amount ******** ");
        policies.stream().max(Comparator.comparingDouble(Policy::getPremiumAmount))
                .stream().forEach(System.out::println);


        System.out.println();

        System.out.println(" ******** 7 Get group policy Amount ******** ");
        Collection<Policy> alphabetic = policies.stream().sorted((Policy p1, Policy p2)-> p1.getPolicyHolderName().compareTo(p2.getPolicyHolderName())).collect(Collectors.toCollection(ArrayList::new));
        System.out.println(alphabetic);

        System.out.println();
        System.out.println(" *********  8 Average premium amount of all insurance policies ************");
        double avg_primiun =  policies.stream().collect(Collectors.averagingDouble(Policy :: getPremiumAmount));
        System.out.println("Average premium of all policies is " + avg_primiun);

        System.out.println();
        System.out.println(" ********* 9 Average premium amount of all insurance policies ************");
        policies.stream().sorted((Policy p1, Policy p2) -> Double.compare(p1.getPremiumAmount(), p2.getPremiumAmount())).forEach((Policy p1) -> System.out.print(p1));

        System.out.println();
        System.out.println(" ********* 10 Average premium amount of all insurance policies ************");
        Collection<Policy> moreThan1000 = policies.stream().filter((Policy p)-> p.getPremiumAmount() >2000).collect(Collectors.toList());
        System.out.println(moreThan1000);

        System.out.println();
        System.out.println(" ********* 11 Policies within specific premium ranges ************");
        System.out.println();
        System.out.println();

        System.out.println("Policy between 0 - 1000");
        System.out.println();
        System.out.println();
        policies.stream().filter(policy -> policy.getPremiumAmount() > 0 && policy.getPremiumAmount() <1000).collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println();
        System.out.println();

        System.out.println("Policy between 1000 - 2000");
        System.out.println();
        System.out.println();
        policies.stream().filter(policy -> policy.getPremiumAmount() > 1000 && policy.getPremiumAmount() <2000).collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println();
        System.out.println();

        System.out.println("Policy > 2000");

        System.out.println();
        System.out.println();
        policies.stream().filter(policy -> policy.getPremiumAmount() > 2000 ).collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println();
        System.out.println();


        System.out.println(" ********* 12 print a list of unique holder names ************");
        System.out.println();
        System.out.println();


        policies.stream().map((Policy p)->p.getPolicyHolderName()).distinct().collect(Collectors.toSet())
                .forEach(System.out::println);
        System.out.println();
        System.out.println();



        System.out.println(" ********* 13 All policies where the holder's name contains a specific substring ************");
        System.out.println();
        System.out.println();


        policies.stream().filter(policy -> policy.getPolicyHolderName().contains("sar"))
                .forEach(System.out::println);
        System.out.println();
        System.out.println();



        System.out.println(" ********* 14 Create map where the key is the policy number and the value is the premium amount ************");
        System.out.println();
        System.out.println();

        Map<String, Double> policyNumber_premiumAmount = policies.stream().collect(Collectors.toMap(policy -> policy.getPolicyNumber(), policy -> policy.getPremiumAmount()));
        for (String i : policyNumber_premiumAmount.keySet()) {
            System.out.println(i + ":" + policyNumber_premiumAmount.get(i));
        }
        System.out.println();






















    }
}
