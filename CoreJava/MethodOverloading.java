public class MethodOverloading {
  public static int add(int num1 , int num2){
    return num1 + num2;
  }

  public static double add(double num1 , double num2){
    return num1 + num2;
  }

  public static int add(int num1 , int num2 , int num3){
    return num1 + num2 + num3;
  }

  public static void main(String[] args) {
    System.out.println("Name: Kavya Maheshwari");
    System.out.println("Timestamp: 25-06-2026 09:56 AM");

    System.out.println("Sum of two integers = " + add(10,20));
    System.out.println("Sum of two doubles = " + add(10.5, 20.5));
    System.out.println("Sum of three integers = " + add(10, 20, 30)); 
  }

}