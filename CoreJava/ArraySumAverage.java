import java.util.Scanner;

public class ArraySumAverage {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter number of elements: ");
        int num = sc.nextInt();

        int [] arr = new int[num];
        int sum = 0;
        double average;

        System.out.println("Enter elements: ");

        for(int i = 0;i<num;i++){
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }

        average = (double)sum / num ;

        System.out.println("Sum = " + sum);

        System.out.println("Average = " + average);

    }
}        