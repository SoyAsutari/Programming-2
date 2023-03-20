/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
import java.util.Scanner;
import biztrainning.*;
import e_latihan.*;
import jomlatihan.*;

public class SemakHargaLatihan {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        
        System.out.println("==== SISTEM SEMAKAN PERKHIDMATAN HARGA LATIHAAN / KURSUS / SEMINAR ====");
        System.out.print("Masukkan bilangan peserta kursus : ");
        int bilpeserta=input.nextInt();
        System.out.print("Masukkan bilangan hari kursus :");
        int bilhari=input.nextInt();
        System.out.print("Masukkan bilangan makan sehari :");
        int bilmakan=input.nextInt();
        System.out.print("Masukkan bilangan bilik yang ingin ditempah :");
        int bilbilik=input.nextInt();
        
        JumlahBiztrainning b=new JumlahBiztrainning();
        JumlahE_Latihan e=new JumlahE_Latihan();
        JumlahJomLatihan j=new JumlahJomLatihan();
        
        b.jumlahbiztrainning(bilhari, bilpeserta, bilmakan, bilbilik);
        j.jumlahjomlatihan(bilhari, bilpeserta, bilmakan, bilbilik);
        e.jumlahe_latihan(bilhari, bilpeserta, bilmakan, bilbilik);
        
        
    }
}
