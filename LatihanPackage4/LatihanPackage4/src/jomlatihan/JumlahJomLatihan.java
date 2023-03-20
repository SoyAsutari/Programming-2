/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jomlatihan;

/**
 *
 * @author Admin
 */
public class JumlahJomLatihan {
    double hargadewanseminar, hargamakanan, hargabilik, deposit, jumlah;
    public void jumlahjomlatihan(int bilhari, int bilpeserta, int bilmakanan, int bilbilik){
        DewanSeminar ds=new DewanSeminar();
        PenyediaanMakanan pm=new PenyediaanMakanan();
        Penginapan p=new Penginapan();
        
        hargadewanseminar=ds.kiraHargaDewan(bilhari);
        hargamakanan=pm.kiraHargaMakanan(bilhari, bilpeserta, bilmakanan);
        hargabilik=p.kiraHargaMenginaap(bilhari, bilbilik);
        
        deposit=(hargadewanseminar+hargamakanan+hargabilik)*20/100;
        jumlah=hargadewanseminar+hargamakanan+hargabilik+deposit;
        
        System.out.println("==== JOMTRAINNING ====");
        System.out.println("Penggunaan Dewan Seminar :"+bilhari+" hari x RM3700.0= RM"+hargadewanseminar);
        System.out.println("Penyediaan Makanan RM6.5 x "+bilhari+" hari x "+bilpeserta+" peserta x "+bilmakanan+" kali makan perhari= RM"+hargamakanan);
        System.out.println("Penginapan RM110.0 x "+bilhari+" hari x "+bilbilik+" buah bilik = RM"+hargabilik);
        System.out.println("Deposit : RM"+deposit);
        System.out.println("Jumlah Bayaran :RM"+jumlah);
    }
}
