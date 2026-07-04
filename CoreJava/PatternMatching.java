public class PatternMatching{
  public static void checkType(Object obj) {
    switch (obj) {
      case Integer i->
        System.out.println("Integer: " + i);
        
      case String s->
        System.out.println("String: " + s);
      
      case Double d ->
        System.out.println("Double: " + d);

      default->
        System.out.println("Other type");  
    }
  }

  public static void main(String[] args) {
    System.out.println("Name: Kavya Maheshwari");
    System.out.println("Timestamp: 26-06-2026 04:08 PM");

    checkType(10);
    checkType("hello");
    checkType(25.2);
    checkType(true);
  }
}