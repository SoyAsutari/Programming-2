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
class Person{
    String name;
    int age;
    
}
class Student extends Person{
    int marks1,marks2,marks3;
    
   void putdata(){
       System.out.println("Name : "+name);
       System.out.println("Age : "+age);
       System.out.println("Marks 1 : "+marks1);
       System.out.println("Marks 2 : "+marks2);
       System.out.println("Marks 3 : "+marks3);
       
   }
}
public class Marks {
    public static void main(String args[]){
        Student s = new Student();
        s.name="Sultana";
        s.age=17;
        s.marks1=67;
        s.marks2=87;
        s.marks3=97;
        
        s.putdata();
        
               
    }
    
}
