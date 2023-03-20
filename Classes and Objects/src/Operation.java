/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Operation {
    
    int data = 50;
    
    void change(int data){
       data = data +100;
    }
    public static void main(String args[]){
        
        Operation op = new Operation();
        
        System.out.println("Befor change  :"+op.data);
        op.change(500);
        System.out.println("After change :"+op.data);
        
        
    }
    
}
