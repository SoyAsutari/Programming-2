/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */

abstract class Shape{
    abstract void draw();
    
}

class Rectangle extends Shape{
    void draw (){
        System.out.println("drawing rectangle");
    }
}

class Circle extends Shape{
      void draw (){
        System.out.println("drawing circle");
    }
}
        
public class TestAbstraction1 {
    public static void main(String args[]){
        Circle c = new Circle();
        c.draw();
    }
    
}
