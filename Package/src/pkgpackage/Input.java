/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgpackage;

/**
 *
 * @author user
 */
import java.util.Scanner;
public class Input {
    public static void main(String args[]){
        String str;
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter Username :" );
        str = s1.nextLine();
        System.out.println("Username : "+str);
    }
    
}
