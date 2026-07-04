import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {

        System.out.println("Name: Kavya Maheshwari");
        System.out.println("Timestamp: 24-06-2026 06:07 PM");

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(100);

        System.out.println("Guess number between 1 to 100: ");
        int guess = sc.nextInt();

        while(guess!=randomNumber){
            if(guess>randomNumber){
                System.out.println("Too High! Try Again.");
            }
            else{
                System.out.println("Too Low! Try Again");
            }
            System.out.println("Guss Again: ");
            guess = sc.nextInt();
        }
        System.out.println("Congratulations! You guessed the correct number.");
    }
}        