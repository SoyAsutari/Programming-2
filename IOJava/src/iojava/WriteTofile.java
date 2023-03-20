/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iojava;

/**
 *
 * @author user
 */
import java.io.FileWriter;
import java.io.IOException;//to handle error
public class WriteTofile {
    public static void main(String args[]){
        
        try{
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write("Files in java might be tricky emough");
            myWriter.close();
            System.out.println("Successfully wrote to the file");
        }
        catch(IOException e){
            System.out.println("An error occured");
            e.printStackTrace();
            
        }
    }
    
}
