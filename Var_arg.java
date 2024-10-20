public class Var_arg {
//    static int sum(int a, int b) {
//       return a + b ;
//    }
//    static int sum(int a, int b,int c) {
//        return a + b + c ;
//    }
//    static int sum(int a, int b,int c, int d) {
//        return a + b + c + d;
//    }
    static int sum(int x,int ...arr){
//        when you pass any parameter like int x then you have to compulsory that you have to take any number
       int result =0;
//       int result =x;
       for(int a:arr){
          result += a;
       }
       return result ;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Varargs tutorial "+sum(0));
        System.out.println("Sum is:"+sum(6,8));
        System.out.println("Sum is:"+sum(8,7,9));
        System.out.println("Sum is:"+sum(8,7,9,20));
    }
}
