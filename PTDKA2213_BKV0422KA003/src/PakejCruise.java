/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
import aquaCruise.*;//untuk import package aquaCruise
import happyCruise.*;//untuk import package happyCruise
import java.util.Scanner;
public class PakejCruise {
    public static void main(String args[]){
      
      int x = 0;
        do{
        Scanner input = new Scanner(System.in);
     try{   
        System.out.println("== PAKEJ PERCUTIAN KAPAL MEWAH ==");
        System.out.println("1. PAKEJ 3 Hari 2 Malam");
        System.out.println("2. Pakej 5 Hari 4 Malam");
        System.out.println("3. Kedua-dua Pakej");
        System.out.print("Pilih pakej anda (Masukkan 1, 2 atau 3) : ");
        int pakej = input.nextInt();
      JumlahAqua ja = new JumlahAqua();
      JumlahHappy jh = new JumlahHappy();
        
    

          switch (pakej){
              case 1 :      
        System.out.print("Masukkan bilangan bilik single : ");
        int bilik1 = input.nextInt();
        System.out.print("Masukkan bilangan bilik double : ");
        int bilik2 = input.nextInt();
        System.out.print("Masukkan bilangan bilik quad : ");
        int bilik3 = input.nextInt();
       
    
   
    ja.Aqua3h2m(pakej,bilik1,bilik2,bilik3);
    jh.Happy3h2m(pakej,bilik1,bilik2,bilik3);
    
                break;
              case 2 :
    System.out.print("Masukkan bilangan bilik single : ");
    bilik1 = input.nextInt();
    System.out.print("Masukkan bilangan bilik double : ");
    bilik2 = input.nextInt();
    System.out.print("Masukkan bilangan bilik quad : ");
    bilik3 = input.nextInt();   
    
  
    ja.Aqua5h4m(pakej,bilik1,bilik2,bilik3);
    jh.Happy3h2m(pakej,bilik1,bilik2,bilik3);  
               break;
               
              case 3 :
     System.out.print("Masukkan bilangan bilik single : ");
     bilik1 = input.nextInt();
     System.out.print("Masukkan bilangan bilik double : ");
    bilik2 = input.nextInt();
     System.out.print("Masukkan bilangan bilik quad : ");
   bilik3 = input.nextInt();
        
           
    ja.Aqua3h2m(pakej,bilik1,bilik2,bilik3);//to shows the total
    jh.Happy3h2m(pakej,bilik1,bilik2,bilik3);
    ja.Aqua5h4m(pakej,bilik1,bilik2,bilik3);
    jh.Happy3h2m(pakej,bilik1,bilik2,bilik3); 
    
             break;
        
           default :
           System.out.println("Ralat Input. Masukkan bilangan yang betul");
          }
          x=1;
     }
    catch(Exception e){
    System.out.println("Pilihan salah. Masukkan 1, 2 atau 3");
    
     
       }
        }while(x == 0);
     
     
           
   
    
  
    
      
          }
          }
