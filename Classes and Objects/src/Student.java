/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Student {
    
    String stud_name;
    int age;
    
    void getData(String studentName,int studentAge){
        
        stud_name = studentName;
        age = studentAge;
        
    }
    
    void displayData(){
        System.out.println("Name :"+stud_name);
        System.out.println("Age :"+age);
        
    }
    public static void main(String args[]){
        
        Student s = new Student();
        s.getData("Jufri", 18);
        s.displayData();
    }
    
}
