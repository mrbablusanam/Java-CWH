import java.util.Scanner;

class Employee {
    int id;
    String name;
    int salary;        // New field for salary
    String profession; // New field for profession
    public void printDetails() {
        System.out.println("Employer ID = " + id);
        System.out.println("Name = " + name);
        System.out.println("Salary = " + salary);
        System.out.println("Profession = " + profession+"\n");
    }
}  
public class Custom_class_39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee Sanam = new Employee();
        Sanam.id = 142;
        Sanam.name = "Sanam";
        Sanam.salary = 50000;       // Assigning value to salary
        Sanam.profession = "Senior Software Engineer"; // Assigning value to profession

        Employee Belal = new Employee();
        Belal.id = 102;
        Belal.name = "Belal";
        Belal.salary = 45000;       // Assigning value to salary
        Belal.profession = "Junior Engineer"; // Assigning value to profession

        Employee Asif = new Employee();
        Asif.id = 111;
        Asif.name = "Asif";
        Asif.salary = 38000;       // Assigning value to salary
        Asif.profession = "Accountant"; // Assigning value to profession

        Employee Sukho = new Employee();
        Sukho.id = 120;
        Sukho.name = "Sukho";
        Sukho.salary = 48000;// Assigning value to salary.profession = "Printer"; // Assigning value to profession
        Sukho.profession = "Manager";
        // Printing all fields
//        System.out.println("ID: " + sanam.id);
//        System.out.println("Name: " + sanam.name);
//        System.out.println("Salary: " + sanam.salary);
//        System.out.println("Profession: " + sanam.profession);
//        sanam.printDetails();
//        asif.printDetails();
//        Sukho.printDetails();
//        Belal.printDetails();

        //Taking User Input
        System.out.println("Enter Employee ID: ");
        int id = sc.nextInt();
          if(id==142){
              Sanam.printDetails();
        } else if (id==102) {
              Belal.printDetails();
          }
          else if(id==111) {
              Asif.printDetails();
          }
          else if(id==120) {
              Sukho.printDetails();
          }
          else{
              System.out.println("Invalid Employee ID");

        }
    }
}
