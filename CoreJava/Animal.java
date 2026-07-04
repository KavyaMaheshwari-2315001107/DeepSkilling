
public class Animal{
  public void makeSound(){
    System.out.println("Animal makes sound.");
  }
  public static void main(String[] args) {
    System.out.println("Name: Kavya Maheshwari");
    System.out.println("Timestamp: 25-06-2026 03:07 PM");

    Animal animal = new Animal();
    Dog dog =  new Dog();

    System.out.println("Animal Sound: ");
    animal.makeSound();

    System.out.println();

    System.out.println("Dog Sound: ");
    dog.makeSound();
    
  }
  
}

class Dog extends Animal{

  @Override
    public void makeSound(){
      System.out.println("Dog Barks!!");
    }

}