package inheritance;

/**
 *
 * @author user
 */
class Sphere{
    double r;
   double sph(){
       return 4.0/3.0*3.14*r*r*r;
    }
}
  class Cylinder extends Sphere{
      double h;
      double cylin(){
          return 3.14*r*r*h;
      }
  }
public class Shape {
    public static void main (String args[]){
        
            double result;
            Sphere obj1 = new  Sphere();
            Cylinder obj2 = new Cylinder();
            
            obj1.r=5.0;
            result = obj1.sph();
            System.out.println("The volume of sphere from obj1 is : "+result+"Cu.Units");
            obj2.r = 3.0;
            result = obj2.sph();
            System.out.println("The volume of sphere from obj2 is "+result+"Cu.units");
            obj2.h=6.0;
            result = obj2.cylin();
            System.out.println("The volume of sphere from Cylin is "+result+"Cu.units");
            
    }
    
}