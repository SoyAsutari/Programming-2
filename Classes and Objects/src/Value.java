/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Value {
    public static void main(String args[]){
        int A = 5,B = 7;
        System.out.println("Before calling the method :");
        System.out.println("A = "+A);
        System.out.println("B = "+B);
        change(A,B);
        System.out.println("After calling the method : ");
        System.out.println("A = "+A);
        System.out.println("B = "+B);
        System.out.println("\nThis is pass by value");
        
    }
    static void change(int A,int B){
        A = 2;
        B = 3;
    }
    
}
