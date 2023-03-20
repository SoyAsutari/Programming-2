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
public class QuadRoom {
    
  double harga;
    double pakej3h2m(int bilik){
        harga = bilik *2299;
        
        return harga;
    }
    double pakej5h4m(int bilik){
        harga = bilik *2699;
        
        return harga;
    }
    
}
