class Animal {
    public void animalSound() {
      System.out.println("The animal makes a sound");
    }
  }
  
  class Pig extends Animal {
    public void animalSound() {
      System.out.println("The pig says: wee wee");
    }
  }
  
  class Dog extends Animal {
    public void animalSound() {
      System.out.println("The dog says: bow wow");
    }
  }
  
public class PolymorphismEx2 {
    public static void main(String[] args) {
        
        Animal myAnimal = new Animal();
        myAnimal.animalSound();

        //Animal myPig = new Pig();
        //Animal myDog = new Dog();
        
    
    
        myAnimal = new Pig();
        myAnimal.animalSound();
        
        myAnimal = new Dog();
        myAnimal.animalSound();
        
        //myPig.animalSound();
        //myDog.animalSound();
    }
}
