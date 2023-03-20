/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KerangMove;

/**
 *
 * @author user
 */
public class JumlahKerang {
     double nasiAyam,nasiTomato,nasiAyamPenyet,caj,jumlah;
    
  public void JumlahKerang(int kuantiti, int nasi1, int nasi2,int nasi3){
        
        NasiAyamKerang na = new NasiAyamKerang();
        NasiAyamPenyetKerang nap = new NasiAyamPenyetKerang();
        NasiTomatoKerang nt = new NasiTomatoKerang();
        
      nasiAyam = na.kira(nasi1);
      nasiTomato = nt.kira(nasi2);
      nasiAyamPenyet = nap.kira(nasi3);
      
      caj = 9.00;
      jumlah = nasiAyam + nasiTomato + nasiAyamPenyet + caj;
      
        System.out.println("<=<=<=<=<KerangMove>=>=>=>=>");
      System.out.println("Nasi Ayam RM6.00 x"+nasi1+": RM"+nasiAyam);
      System.out.println("Nasi Tomato RM6.50 x"+nasi2+": RM"+nasiTomato);
      System.out.println("Nasi Ayam Penyet RM7.00 x"+nasi1+": RM"+nasiAyamPenyet);
    }
}
