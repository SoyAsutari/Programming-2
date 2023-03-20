/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Salary {
    
    String name;
    int age;
    double gaji;
    
    void getData(String pName,int pAge,double pGaji){
        
        name =pName;
        age = pAge;
        gaji = pGaji;
    }
    void displayData(){
        System.out.println("Person name : "+name);
        System.out.println("Person age : "+age);
        System.out.println("Person salary : "+gaji);
        
    }
    public static void main(String args[]){
        
        Salary s1 = new Salary();
        s1.getData();
        
    }
    
}
