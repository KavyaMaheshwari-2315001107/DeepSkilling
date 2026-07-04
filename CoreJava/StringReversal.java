import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args) {

        System.out.println("Name: Kavya Maheshwari");
        System.out.println("Timestamp: 25-06-2026 12:16 PM");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder(str);

        System.out.println("Reversed string = " + sb.reverse());
    }
}        