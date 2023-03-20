/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class MultiCatchDemo2 {
    public static void main(String args[]){
    
        try{
        int a=10, b=0, c=0;
        int arr[]={10,20};
        
        c = a/b;
        int var = arr[2]=arr[1];
    }
        
        catch(ArithmeticException x){
            System.out.println("Arithmetic exception de to division by zero");
        }
        
        catch(ArrayIndexOutOfBoundsException ae){
            System.out.println("Index not in range is used");
            
        }
        catch(Exception e){
            System.out.println("Index");
        }
   }
    
}
