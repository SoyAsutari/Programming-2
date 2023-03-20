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
public class JumlahBintang {
    double hargaBilik1,hargaBilik2,hargaBilik3,caj,jumlah;
   public void JumlahBintang(int malam,int bilik1,int bilik2,int bilik3){
        
        SingleRoom sr = new SingleRoom();
        DoubleRoom dr = new DoubleRoom();
        FamilyRoom fr = new FamilyRoom();
        
       hargaBilik1 = sr.kira(malam,bilik1);
       hargaBilik2 = dr.kira(malam,bilik2);
       hargaBilik3 = fr.kira(malam,bilik3);
       
       caj = (hargaBilik1 + hargaBilik2 + hargaBilik3) * 0.05;
       jumlah = (hargaBilik1 + hargaBilik2 + hargaBilik3) + caj;
       
       System.out.println("HOTEL BINTANG");
       System.out.println("~~~~~~~~~~~~~");
       System.out.println("Single Room x" +bilik1+" : RM "+hargaBilik1);
       System.out.println("Double Room x" +bilik2+" : RM "+hargaBilik3);
       System.out.println("Family Room x" +bilik3+" : RM "+hargaBilik3);
       System.out.println("Caj Perkhidmatan (5%) : RM "+caj);
       System.out.println("Jumlah : RM "+jumlah);
       
    }
    
}
