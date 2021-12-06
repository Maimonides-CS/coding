// Interface
interface Animal {
  public void animalSound(int sec); // interface method (does not have a body)
  public void sleep(); // interface method (does not have a body)
}

// Pig "implements" the Animal interface
class Pig implements Animal {
  public void sleep() {
    // The body of sleep() is provided here
    System.out.println("Zzz");
  }

  public void animalSound(int sec) {
    // The body of animalSound() is provided here
    System.out.println("The pig says: the sound lasts " + sec + " seconds" );
  }

}

class Interface {
  public static void main(String[] args) {
    Pig myPig = new Pig();  // Create a Pig object
    myPig.animalSound(4);
    myPig.sleep();
  }
}
