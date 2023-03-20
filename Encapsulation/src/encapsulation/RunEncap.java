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
/* File name : EncapTest.java */
 class EncapTest {
   private String name;
   private String idNum;
   private int age;

   public int getAge() {
      return age;
   }

   public String getName() {
      return name;
   }

   public String getIdNum() {
      return idNum;
   }

   public void setAge( int newAge) {
      age = newAge;
   }

   public void setName(String newName) {
      name = newName;
   }

   public void setIdNum( String newId) {
      idNum = newId;
   }
   public class RunEncap {

  public static void main (String args[]){
      EncapTest e = new EncapTest();
      e.setName("Jufri");
      e.setAge(19);
      e.setIdNum("123");

      System.out.print("Name : " + e.getName() + " Age : " +  e.getAge());
   }
}
}