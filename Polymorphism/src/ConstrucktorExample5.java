/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class ConstrucktorExample5 {
    
    int num;
    boolean isStudent;
    String str;
    
      
      ConstrucktorExample5(boolean boolean1){
       System.out.println("One augument construcktor called");
       isStudent = boolean1;
   }
      ConstrucktorExample5(int,String){
          System.out.println("One argument constucktor called...");
          num = n;
          str = s;
          
      }
      ConstrucktorExample5(boolean boolean1,int,String s){
          isStudent = boolean;
          num =n;
          str = s;
      }
  
   public static  void main(String args[]){
     
       ConstrucktorExample5 obj1 = new ConstrucktorExample5(true);
       
       System.out.println("isStudent "+obj1.isStudent);
       System.out.println("num "+obj1.num);
       System.out.println("str "+obj1.str);
       
       ConstrucktorExample5 obj2 = new ConstrucktorExample5(10,"W3schoolpoint");
       
        System.out.println("isStudent "+obj1.isStudent);
       System.out.println("num "+obj1.num);
       System.out.println("str "+obj1.str);
       
        ConstrucktorExample5 obj3 = new ConstrucktorExample5(fales,int,String);
   }
    
}
