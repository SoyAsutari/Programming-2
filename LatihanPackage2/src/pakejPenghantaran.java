/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
import FoodBear.*;
import KerangMove.*;
import TangkapFood.*;
import java.util.Scanner;
public class pakejPenghantaran {
    public static void main (String args[]){
      int x = 0;
      do{
     Scanner input = new Scanner(System.in);
      try{
     System.out.println("== RESTORAN NUR KASIH ==");
     System.out.println("");
     System.out.print("Masukkan Bilangan Tempahan : ");
     int kuantiti =  input.nextInt();
     System.out.print("1. Bilangan Nasi Ayam : ");
     int nasi1 = input.nextInt();
     System.out.print("2. Bilangan Nasi Tomato :");
     int nasi2 = input.nextInt();
     System.out.print("3. Bilangan Nasi Ayam Penyet : ");
     int nasi3 = input.nextInt();
    
     JumlahFood jf = new JumlahFood();
     JumlahKerang jk = new JumlahKerang();
     JumlahTangkap jt = new JumlahTangkap();
     
     jf.JumlahFood(kuantiti,nasi1,nasi2,nasi3);
     jk.JumlahKerang(kuantiti,nasi1,nasi2,nasi3);
     jt.JumlahTangkap(kuantiti,nasi1,nasi2,nasi3);
     
      x=1;
            
    }
      catch(Exception e){
    System.out.println("RALAT INPUT Sila Masuukan ralat input yang betul");
    
     
       }
        }while(x == 0);
    }
}