import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListEg{

    public static void main(String[] args) {

        System.out.println("Name: Kavya Maheshwari");
        System.out.println("Timestamp: 26-06-2026 11:26 AM");

        Scanner sc = new Scanner(System.in);

        ArrayList <String> students = new ArrayList<>();

        System.out.println("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i =1;i<=n;i++){
            System.out.println("Enter student name " + i + ": ");
            String name = sc.nextLine();
            students.add(name);
        }

        System.out.println("\nStudents Names: ");

        for(String name: students){
            System.out.println(name);
        }
    }
}        