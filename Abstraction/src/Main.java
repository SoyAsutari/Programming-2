/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
abstract class Animal{
    abstract void animalSound();
   void sleep(){
        System.out.println("Zzzzzz");
    }   
}

class Cat extends Animal{
    void animalSound(){
        System.out.println("The cat says : meow meow");
        
    }
}
public class Main {
    public static void main (String args[]){
        Cat c = new Cat();
        c.animalSound();
        c.sleep();
    }
    
}
