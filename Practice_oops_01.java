import java.util.Scanner;

//problem 1
/*class Employee1{
     int salary ;
     String name;

     public int getSalary(){
          return salary;
     }
     public String getName(){
          return name;
     }
     public void setName(String n){
          name=n;
     }
}
//problem 2
class Cellphone{
     String number;
     String ringing;
     String vibration;

     public void number(){
          System.out.println("Number...");
     }
     public void ringing(){
          System.out.println("Ringing...");
     }
     public void Vibration(){
          System.out.println("Vibration...");
     }
}
 */
//problem 3
/* class Square{
     int side;
     int area;
     int perimeter;

     public int getArea(){
     return side*side;

     }
     public int getPerimeter(){
          return 4*side;
     }
}
 */
//problem 4
/*
class Rectangle{
     int length;
     int breadth;
     public int Area(){
          return length * breadth;
     }
     public int Perimeter(){
          return length + breadth;
     }
}
*/
//problem 5
/*
class Tommy_Vecetti{
     public void Hit(){
          System.out.println("Hitting the Enemy");
     }
     public void Run(){
          System.out.println("Running from the Enemy");
     }
     public void Fire(){
          System.out.println("Firing on Enemy");
     }
}
*/
public class Practice_oops_01 {
     public static void main(String[] args) {
          //problem 1
        /*  Employee1 emp = new Employee1();
          emp.setName("Mr-Sanam");
          emp.salary = 2000;
          System.out.println("The Name of the Employee is: "+emp.getName());
          System.out.println("The Salary of Employee is: "+emp.getSalary());

          //problem 2 Object
          Cellphone phn=new Cellphone();
          phn.number="9135465217";
          phn.number();
          phn.ringing();
          phn.Vibration();
         */
           //problem 3
         /* Scanner sc = new Scanner(System.in);
          Square sqr=new Square();
          System.out.println("Enter the side");
          sqr.side = sc.nextInt();

          System.out.println("The Area of Square is: "+sqr.getArea());
          System.out.println("The Perimeter of Square is: "+sqr.getPerimeter());
          */
          //problem 4
             /*
          Scanner sc = new Scanner(System.in);
          Rectangle rect= new Rectangle();
          System.out.println("Enter the length of the rectangle: ");
          rect.length = sc.nextInt();
          rect.breadth = sc.nextInt();

          System.out.println("The Area of the rectangle is: "+rect.Area());
          System.out.println("Perimeter of the rectangle is: "+rect.Perimeter());
*/
          //problem 5
          /*
          Tommy_Vecetti game = new Tommy_Vecetti();
          game.Run();
          game.Hit();
          game.Fire();
*/
     }
}
