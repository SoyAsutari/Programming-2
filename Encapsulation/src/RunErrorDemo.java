/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class RunErrorDemo {
    public static void main(String args[]){
       
        try{
        int a = 5;
        int b = 0;
        int c;
        c = a/b;
        System.out.println(c);
    }
        
        catch(ArithmeticException c){
        }            System.out.println("Error");

   } 
}
