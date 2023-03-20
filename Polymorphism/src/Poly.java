/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Poly {
    public static void main (String args[]){
        Over ov1 = new Over();
        ov1.display();
        ov1.display(2);
        ov1.display("Kuala Lumpur is the garden city of lights",3);
    }
    
    
}
 class Over{
  void display(){
        System.out.println("Melaka is a historical state");
    }
    
    void display(int i){
        int j = 0;
        while(j<i){}
        System.out.println("Johor is the 3rd largest");
        j++;
    }
    void display(String str,int i){
        for(int j = 1;j <= i;j++){}
        System.out.println(str);
    }
}
