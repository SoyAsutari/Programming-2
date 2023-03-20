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
class Vehicle{
    void run(){
        System.out.println("Vehicle is runnning");
    }
}
public class Bike extends Vehicle {
    void run(){
        System.out.println("Bike is running safely");
    }
   public static void main (String args[]){
       Bike b = new Bike();
       b.run();   
   }
}
