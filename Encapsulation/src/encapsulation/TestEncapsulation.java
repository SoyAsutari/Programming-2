/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation;

/**
 *
 * @author user
 */

class Account {
    
private long acc_no;  
private String name,email;  
private float amount;  
public long getAcc_no() {  
    
    
    
    return acc_no;  
}  
public void setAcc_no(long acc_no) {  
    this.acc_no = acc_no;  
}  
public String getName() {  
    return name;  
}  
public void setName(String name) {  
    this.name = name;  
}  
public String getEmail() {  
    return email;  
}  
public void setEmail(String email) {  
    this.email = email;  
}  
public float getAmount() {  
    return amount;  
}  
public void setAmount(float amount) {  
    this.amount = amount;  
}  
  
}  


public class TestEncapsulation {  
public static void main(String[] args) {  
    Account a=new Account();  
    a.setAcc_no(123123252L);  
    a.setName("Nora Kadir");  
    a.setEmail("NoraKadir@jepshouse.com");  
    a.setAmount(50021123);  
    System.out.println(a.getAcc_no()+" "+a.getName()+" "+a.getEmail()+" "+a.getAmount());  
}  
}  