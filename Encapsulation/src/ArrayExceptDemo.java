/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class ArrayExceptDemo {
    public static void main(String args[]){
    
        int var[] = {5,10};
        try{
             int x = var[2]-var[1];
        }
        
        catch(ArrayIndexOutOfBoundsException x){
            System.out.println("Array subscript our of range");
        }
      
    }
    
    
}
