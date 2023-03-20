/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package central;

/**
 *
 * @author user
 */
public class SingleRoom {
       double harga;
    double kira(int malam,int bilik){
        harga = malam * bilik *90.00;
        
        return harga;
    }
}
