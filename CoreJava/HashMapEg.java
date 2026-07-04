import java.util.HashMap;
import java.util.Scanner;
public class HashMapEg {
    public static void main(String[] args) {
        System.out.println("Name: Kavya Maheshwari");
        System.out.println("Timestamp: 26-06-2026 12:18 PM");
        Scanner sc = new Scanner(System.in);
        HashMap<Integer , String> students = new HashMap<>(); 
        System.out.println("Enter number of students: ");
        int n = sc.nextInt();
        for(int i =1;i<=n;i++){
            System.out.println("Enter Student Id: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Student Name: ");
            String name = sc.nextLine();
            students.put(id,name);
        }
        System.out.println("Enter Student Id to search: ");
        int searchId = sc.nextInt();

        if(students.containsKey(searchId)){
            System.out.println("Student Name: " + students.get(searchId));
        }else{
            System.out.println("Id not found");
        }
    }
}        
