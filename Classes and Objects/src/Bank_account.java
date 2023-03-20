/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Bank_account {
    
    String depositorName;
    float accountNo;
    String accountType;
    float balance;
    
    void getData(String name,float no,String type,float bal){
        
        depositorName = name;
        accountNo = no;
        accountType = type;
        balance = bal;
    }
    
    void displayData(){
        System.out.println("Depositor Nama : "+depositorName);
        System.out.println("Account balance : "+balance);
    }
    
    public static void main(String args[]){
        
        Bank_account b1 = new Bank_account();
        b1.depositorName ="Firdaus";
        b1.balance = 2000000000;
        b1.displayData();
    }
}
