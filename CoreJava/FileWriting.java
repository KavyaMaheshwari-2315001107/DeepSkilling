import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriting {

    public static void main(String[] args) {

        System.out.println("Name: Kavya Maheshwari");
        System.out.println("Timestamp: 26-06-2026 10:08 AM");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        try{
            FileWriter writer = new FileWriter("output.txt");

            writer.write(text);
            writer.close();

            System.out.println("Data written successfully");
        }
        catch(IOException e){
            System.out.println("Error while writing to file");
        }
    }
}        