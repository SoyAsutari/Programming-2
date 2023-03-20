/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Product {
    public static void main(String args[]){
        
        int result1;
        double result2;
        prod obj=new prod();
        
        result1=obj.multiply(12,13);
        result2=obj.multiply(2.5,3.2);
        System.out.println(result1);
        System.out.println(result2);
 
        
    }
}
class prod{
    int multiply(int No1,int No2){
        return(No1*No2);
    }
    double multiply(double No1,double No2){
        return(No1*No2);
    }
}
