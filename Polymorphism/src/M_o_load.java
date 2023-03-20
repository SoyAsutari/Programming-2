/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class M_o_load {
    public static void main (String args[]){
        double sphere,cylinder,rad=4,ht=6;
        overload ov  =new overload();
        sphere = ov.volume(rad);
        cylinder = ov.volume(rad,ht);
        System.out.println("The volume of sphere : "+sphere);
        System.out.println("The volume of cylinder : "+cylinder);
                
        
        
        
    }
    
}

class overload{
    double volume(double r){
       double vol;
        vol=4/3*r*r*r*3.14;
        return vol;
    }
       double volume(double r,  double h){
           double vol;
           vol=3.14*r*r*h;
        return vol;
    }
}
