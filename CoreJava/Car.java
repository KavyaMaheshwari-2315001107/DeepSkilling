

public class Car{
  String make;
  String model;
  int year;

  public void displayDetails(){
    System.out.println("Make:" + make);
    System.out.println("Model:" + model);
    System.out.println("Year: " + year);
  }
  public static void main(String[] args) {
    System.out.println("Name: Kavya Maheshwari");
    System.out.println("Timestamp: 25-06-2026 02:02 PM");    

    Car car1 = new Car();
    car1.make = "Hyundai";
    car1.model = "Creta";
    car1.year = 2024;

    Car car2 = new Car();
    car2.make = "Toyota";
    car2.model = "Fortuner";
    car2.year = 2024;

    System.out.println("Car 1 Details:");
    car1.displayDetails();

    System.out.println();

    System.out.println("Car 2 Details:");
    car2.displayDetails();
  }
}