import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {

        System.out.println("Name: Kavya Maheshwari");
        System.out.println("Timestamp: 25-06-2026 01:08 PM");

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter string:");
        String str = sc.nextLine();

        str = str.replaceAll("[^a-zA-Z0-9]","");

        str = str.toLowerCase();

        StringBuilder sb = new StringBuilder(str);
        String reverse = sb.reverse().toString();

        if(str.equals(reverse)){
            System.out.println("The string is a Palindrome.");
        }else{
            System.out.println("The string is not Palindrome.");
        }
    }
}        