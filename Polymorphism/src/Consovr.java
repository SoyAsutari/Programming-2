/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Consovr {
    public static void main(String args[]){
        double area;
        area a1 = new area(1);
        area a2 = new area(5,4);
        System.out.println("The area of the square of side 5 unit is : "+a1.square(5));
        System.out.println("The area of the rectangle of sides 5 x 4 unit is "+a2.rect(5,4));
    }
    
}
class area{
    
   double l,w;
   area(double l){
      this.l = l;
      
   }
  area(double l,double w ){
      this.l = 1;
      this.w = w;
  }
  
    double square(double l){
        return l*l;
    }
    double rect(double l , double w){
        return l*w;
    }

}