/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author user
 */
public class java {
    public static void main(String args[]){
        volume vol1 = new volume(4.0);
        volume vol2 = new volume(4.0,6.0);
        vol1.sphere();
        vol2.cylinder();
        
        
    }
    
}
class volume {
    double r,h;
    volume(double r){
        this.r=r;
    }
    volume (double r,double h){
        this.r = r;
        this.h = h;
   }
    void sphere(){
        double vol;
        vol=4/3*3.14*r*r*r;
        System.out.println("The volume of sphere is :"+vol);
    }
    void cylinder(){
        double vol;
        vol=3.14*r*r*r*h;
        System.out.println("The volum of cylyndedr is : "+vol);
    }
}