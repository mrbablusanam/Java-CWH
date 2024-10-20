import java.util.Scanner;

public class methods_practice_questions {
//    problem 1
//    static void table(int n) {
//        System.out.print("The table of "+n+" is:\n");
//        for(int i=1;i<=10;i++){
//            System.out.println(n+" x "+i+" = "+n*i);
//        }
//        return n;
//        problem 2
//        static void pattern1(int n){
//            for(int i=0;i<n;i++){
//                for(int j=0;j<i+1;j++){
//                    System.out.print("*");
//                }
//                System.out.println();
//            }
//    }
//    problem 3
    //sum(n) = sum(n-1)
    //sum(3) = 3 + sum(2)
    //sum(4) = 3 + 2 + 1
//    static int sumRec(int n){
//        //Base Condition
//        if(n==1){
//            return 1;
//        }
//        return n + sumRec(n-1);
//    }
    public static void main(String[] args) {
        Scanner table=new Scanner(System.in);
//        System.out.println("Enter the number you want to print table:");
        int n=table.nextInt();
//       int c= sumRec(n);
//       System.out.println(c);
//        table(n);
//        pattern1(n);




    }
}
