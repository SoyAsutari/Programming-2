/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
import silk.*;
import central.*;
import bintang.*;
import java.util.Scanner;
public class SemakHargaHotel {
    public static void main (String args[]){
        int x = 0;
        do{
        Scanner input = new Scanner(System.in);
     try{   
    System.out.println(" == SISTEM SEMAKAN HARGA HOTEL == ");
    System.out.println("");
    System.out.print("Masukkan bilangan malam menginap : ");
    int malam = input.nextInt();
    System.out.print("Masukkan bilangan bilik single : ");
    int bilik1 = input.nextInt();
    System.out.print("Masukkan bilangan bilik double : ");
    int bilik2 = input.nextInt();
    System.out.print("Masukkan bilangan bilik family : ");
    int bilik3 = input.nextInt();
     
    System.out.println("== SENARAI HARGA BILIK UNTUK "+malam+" MALAM");

    JumlahSilk js = new JumlahSilk();
    JumlahCentral jc = new JumlahCentral();
    JumlahBintang jb = new JumlahBintang();
    
    js.JumlahSilk(malam,bilik1,bilik2,bilik3);
    jc.JumlahCentral(malam,bilik1,bilik2,bilik3);
    jb.JumlahBintang(malam, bilik1, bilik2, bilik3);
    
    x=1;
            
    }
      catch(Exception e){
    System.out.println("RALAT INPUT Sila Masuukan ralat input yang betul");
    
     
       }
        }while(x == 0);
    }
}
