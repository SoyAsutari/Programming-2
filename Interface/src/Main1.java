/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
interface FirstInterface{
    public void myMethod();
}

interface SecondInterface{
    public void myOtherMethod();
}

class DemoClass implements FirstInterface, SecondInterface{
    public void myMethod(){
        System.out.println("Some text..");
    }
    public void myOtherMethod(){
        System.out.println("Some other text..");
    }
}

public class Main1 {
    public static void main(String args[]){
        DemoClass myObj = new DemoClass();
        myObj.myMethod();
        myObj.myOtherMethod();
    }
}