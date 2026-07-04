import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class LambdaExpression {

    public static void main(String[] args) {

        System.out.println("Name: Kavya Maheshwari");
        System.out.println("Timestamp: 26-06-2026 02:06 PM");

        List<String> names  = Arrays.asList("Emma","Jill","Harry","Aaron");


        Collections.sort(names,(a,b) -> a.compareTo(b));

        System.out.println("Sorted List: ");

        for(String name : names ){
            System.out.println(name);
        }
        
    }
}        