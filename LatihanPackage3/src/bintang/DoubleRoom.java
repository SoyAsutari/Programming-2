/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bintang;

/**
 *
 * @author user
 */
public class DoubleRoom {
    double harga;
    double kira(int malam,int bilik2){
        harga = malam * bilik2 *150.00;
        
        return harga;
    }
    
}
