interface Playable{
  void play();
}

class Guitar implements Playable{
  public void play(){
    System.out.println("Playing Guitar!!");
  }
}

class Piano implements Playable{
  public void play(){
    System.out.println("Playing Piano!!");
  }
}

public class InterfaceImplementation{
  public static void main(String[] args) {
    System.out.println("Name: Kavya Maheshwari");
    System.out.println("Timestamp: 25-06-2026 04:11 PM");
    System.out.println();

    Guitar guitar = new Guitar();
    Piano piano = new Piano();

    guitar.play();
    piano.play();
    
  }
  
}