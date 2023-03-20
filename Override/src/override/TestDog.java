/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package override;

/**
 *
 * @author user
 */
class Animal{
    void move(){
        System.out.println("Animals can move");
    }
}

class Dog extends Animal{
    void move(){
        System.out.println("Dogs can fly");
    }
    
    void bark(){
        System.out.println("Dogs can bark");
    }
}
public class TestDog {
    public static void main(String args[]){
        Animal a = new Animal();
        Animal b = new Dog();
        
        a.move();
        b.move();
    }
    
}
