import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

record Person(String name , int age){}

public class RecordsExample {

    public static void main(String[] args) {

        System.out.println("Name: Kavya Maheshwari");
        System.out.println("Timestamp: 26-06-2026 03:15 PM");

        Person p1 = new Person("Adamya" , 20);
        Person p2 = new Person("Kavya" , 17);
        Person p3 = new Person("Arpita" , 22);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        List<Person> people  = Arrays.asList(p1,p2,p3);
        List<Person> adults = people.stream().filter(person -> person.age() >=18).collect(Collectors.toList());

        System.out.println("\n Person with age 18 or above:");
        System.out.println(adults);
    }
}        