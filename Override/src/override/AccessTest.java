/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package override;

/**
 *
 * @author user
 */
class A{
    int a;
    private  int b;
    protected int c;
    public int d;
}
void set(){

    a=1;
    b=2;
    c=3;
    d=4;


}

public class AccessTest {
    public static void main(String args[]){
        A b =new A();
        B b = new B();
        a.a=15;
        a.b=25;
        a.c=35;
        a.d=45;
        a.set()
        
    }
    
}
