/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biztrainning;

/**
 *
 * @author Admin
 */
public class PenyediaanMakanan {
    double kiraHargaMakanan(int bilhari, int bilpeserta, int bilmakanan){
        double harga = bilpeserta*bilhari*bilmakanan*5;
        return harga;
    }
}
