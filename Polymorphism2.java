class Animal {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }

  public void weight(int w) {
    System.out.println("The animal weight is " + w);
  }

}

class Pig extends Animal {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }

  public void parentSound() {
    super.animalSound();
  }
}

class Dog extends Animal {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}

class Polymorphism2 {
  public static void main(String[] args) {
    Animal myAnimal = new Animal();
    Animal myPig = new Pig();
    Animal myDog = new Dog();

    myAnimal.animalSound();
    myPig.animalSound();
    myDog.animalSound();

    Pig myPig2 = new Pig();    

    myPig2.parentSound();
    //myPig.parentSound();
    
  }
}
