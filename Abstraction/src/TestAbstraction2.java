/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
abstract class Bike{
    
    Bike(){
        System.out.println("bike is created");
        
    }
    abstract void run();
    void changeGear(){
        System.out.println("gear changed");
    }
    
}
class Honda extends Bike{
    void run(){
        System.out.println("Running safely");
    }
}
public class TestAbstraction2 {
    public static void main(String args[]){
        Bike b = new Honda();
        b.run();
        b.changeGear();
    }
}
