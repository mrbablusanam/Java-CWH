import java.util.Scanner;
public class methods_overloading {
    static void foo(){
        System.out.println("Kya hal hai puttar");
    }
      static void foo(int a){
        System.out.println("Bhai mere "+a+" rupay dede yrrr");
    }
    static void foo(String name){
        Scanner sc=new Scanner(System.in);
        System.out.println("Tera Naam kya hai Bro");
        name=sc.nextLine();
        System.out.println("My Name is "+name);
    }
    public static void main(String [] sanam ){
        foo();
        foo(100);
        foo("name");
    }
}
