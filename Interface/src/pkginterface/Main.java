/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

/**
 *
 * @author user
 */
// Interface
interface Animal {
  public void animalSound(); // interface method (does not have a body)
  public void sleep(); // interface method (does not have a body)
}

// Pig "implements" the Animal interface
class Kitten implements Animal {
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The pig says: Nora Kadir!");
  }
  public void sleep() {
    // The body of sleep() is provided here
    System.out.println("Zzz");
  }
}

class Main {
  public static void main(String[] args) {
    Kitten k = new Kitten();  // Create a Pig object
    k.animalSound();
    k.sleep();
  }
}