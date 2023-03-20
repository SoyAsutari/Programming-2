/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author user
 */
class Superclass{
    int age;
    
    Superclass(int age){
       this.age= age;
    }
    
  void getAge(){
        System.out.println("The value of the variable named age in superclass is : "+age);
    }
}
public class SubClass extends Superclass {
    SubClass(int age){
        super(age);
    }
    public static void main(String args[]){
        SubClass s = new SubClass(24);
        s.getAge();
    }
}
