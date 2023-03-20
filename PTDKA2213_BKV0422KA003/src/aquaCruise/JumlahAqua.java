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
public class JumlahAqua {
    
      double hargaBilik1,hargaBilik2,hargaBilik3,caj,jumlah;
   public void Aqua3h2m(int malam,int bilik1,int bilik2,int bilik3){
        
        SingleRoom sr = new SingleRoom();
        DoubleRoom dr = new DoubleRoom();
        QuadRoom qr = new QuadRoom();
        
       hargaBilik1 = sr.pakej3h2m(bilik1);
       hargaBilik2 = dr.pakej3h2m(bilik2);
       hargaBilik3 = qr.pakej3h2m(bilik3);
       
       caj = (hargaBilik1 + hargaBilik2 + hargaBilik3) * 0.10;
       jumlah = (hargaBilik1 + hargaBilik2 + hargaBilik3) + caj;
       
       System.out.println("== SENARAI HARGA PAKEJ 3 HARI 2 MALAM ==");
       System.out.println("");
       System.out.println("AQUA CRUISE");
       System.out.println("Single Room x" +bilik1+" : RM "+hargaBilik1);
       System.out.println("Double Room x" +bilik2+" : RM "+hargaBilik3);
       System.out.println("Quad Room x" +bilik3+" : RM "+hargaBilik3);
       System.out.println("Caj Perkhidmatan (5%) : RM "+caj);
       System.out.println("Jumlah : RM "+jumlah);
       
    }
    public void Aqua5h4m(int malam,int bilik1,int bilik2,int bilik3){
        
        SingleRoom sr = new SingleRoom();
        DoubleRoom dr = new DoubleRoom();
        QuadRoom qr = new QuadRoom();
        
       hargaBilik1 = sr.pakej5h4m(bilik1);
       hargaBilik2 = dr.pakej5h4m(bilik2);
       hargaBilik3 = qr.pakej5h4m(bilik3);
       
       caj = (hargaBilik1 + hargaBilik2 + hargaBilik3) * 0.10;
       jumlah = (hargaBilik1 + hargaBilik2 + hargaBilik3) + caj;
       
       System.out.println("== SENARAI HARGA PAKEJ 5 HARI 4 MALAM ==");
       System.out.println("");
       System.out.println("AQUA CRUISE");
       System.out.println("Single Room x" +bilik1+" : RM "+hargaBilik1);
       System.out.println("Double Room x" +bilik2+" : RM "+hargaBilik3);
       System.out.println("Quad Room x" +bilik3+" : RM "+hargaBilik3);
       System.out.println("Caj Perkhidmatan (5%) : RM "+caj);
       System.out.println("Jumlah : RM "+jumlah);
    }
}
