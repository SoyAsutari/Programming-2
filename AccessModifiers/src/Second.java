/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
abstract class Main1{
    public String name = "John";
    public int age = 19;
    abstract void study();
}
class Student extends Main1{
  public int graduationYear = 2025;
  public void study(){
     System.out.println("Studying all day long");
  }
}
public class Second {
    public static void main(String args[]){
        Student s = new Student();
        
        System.out.println("Name : "+s.name);
        System.out.println("Age : "+s.age);
        System.out.println("Graduation Year : "+s.graduationYear);
    }
}
