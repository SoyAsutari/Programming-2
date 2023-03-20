/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
class AA{
  int No;
}



public class Books {
    public static void main (String args[]){
        
        AA obj1 = new AA();
        obj1.No = 325;
        AA obj2 = obj1;
        obj2.No = 400;
        System.out.println("Number of pgages : "+obj1.No);
    }
    
}
