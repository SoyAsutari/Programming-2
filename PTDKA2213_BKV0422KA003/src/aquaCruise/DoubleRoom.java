/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aquaCruise;

/**
 *
 * @author user
 */
public class DoubleRoom {
    
  double harga;
    double pakej3h2m(int bilik){
        harga = bilik *1199;
        
        return harga;
    }
    double pakej5h4m(int bilik){
        harga = bilik *1499;
        
        return harga;
    }
    
}
