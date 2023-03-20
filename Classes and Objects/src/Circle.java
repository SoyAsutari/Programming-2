/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Circle {
    
    double pi;
    double r;
    
    void getData(double p1,double r1){
        
        pi = p1;
        r = r1;
    }
    void displayData(){
        System.out.println("Area of a circle : "+(pi*r*r));
    }
    public static void main(String args[]){
        
      Circle c = new Circle();
      c.getData(3.142, 2);
      c.displayData();
   
    }
    
}
