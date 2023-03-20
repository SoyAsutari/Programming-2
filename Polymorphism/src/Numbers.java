/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Numbers {
public static void main(String args[]){
    Sum obj1 = new Sum(0,0);
    Sum obj2 = new Sum(0.0,0.0);
    obj1.add(5,7);
    obj2.add(5.0,7.0);
    
}   
}
class Sum{
    int a,b;
    double c,d;
    Sum(int a, int b){
        this.a = a;
        this.b = b;
                
    }
    Sum(double c , double d){
        this.c = c;
        this.d = d;
    }
    void add(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("The sum is "+(this.a + this.b));
        
    }
    void add(double c,double d){
        this.c = c;
        this.d = d;
        System.out.println("The sum is "+(this.c+this.d));
    }
}
