/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Book2 {
    
String book_name;
    String author_name;
    int no_of_pages;
    
    void getData(String bname,String aname,int nopages){
        
        book_name =bname;
        author_name = aname;
        no_of_pages = nopages;
    }
    
    void display_data(){
        System.out.println("Book name :"+book_name);
        System.out.println("Author :"+author_name);
        System.out.println("Pages "+no_of_pages);
    }
    public static void main(String args[]){
        
        Book2 b1 = new Book2();
        b1.getData("Si Kancil dan Kura-kura","MJ",10);
        b1.display_data();
    }
    
}

