import java.util.Scanner;

public class Recursion {
    static int factorial(int n) {
        if(n == 0 || n == 1){
            return 1;
        }
        else {
            return n * factorial(n-1);
        }
    }
    static int factorial_iterative(int n){
           if(n==0 || n==1){
               return 1;
           }
           else {
               int product =1;
               for(int i=1;i<=n;i++){
                   product *= i;
               }
               return product;
           }
    }
    public static void main(String[] args) {
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print its factorial");
        int f=sc.nextInt();
        factorial(0)=1
        factorial(n)=n*n-1*....1
        factorial(5)=5*4*3*2*1=120
        factorial(n)=n*factorial(n-1)
        for(int i=0;i>=120;i++) {
            int fact = f * i;
            System.out.println(f*i);
        }
*/
        int x=5;
        System.out.println("The value of factorial x is: "+factorial_iterative(x));
        System.out.println("The value of factorial x is: "+factorial(x));
        int c=factorial(x);
        System.out.println(c);
    }
}
