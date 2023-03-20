/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author user
 */
class Calculation{
    int z;
    
  void  addition (int x, int y){
        z = x + y;
        System.out.println("The sum of the given numbers : "+z);
    }
  void subtraction (int x, int y){
       z = x + y;
        System.out.println("The difference of the given numbers : "+z);
  }
}
public class My_Calculation extends Calculation{
   void multiplication(int x , int y){
        z = x * y;
        System.out.println("The product of the given numbers : "+z);
    }
    public static void main(String args[]){
        int a = 20,b = 10;
        My_Calculation demo = new My_Calculation();
        
        demo.addition(a,b);
        demo.subtraction(a,b);
        demo.multiplication(a, b);
        }
        
    }
    

