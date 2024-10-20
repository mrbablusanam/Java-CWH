public class methods_31 {
    static int logic(int x , int y){
        int z;
        if(x>y){
            z=x+y;
        }
        else{
            z=(x+y)*2;
        }
//        Nothing will change  bcz x and y is a copy
        x=69;
        y=50;
        return z;
    }
    public static void main(String [] args) {
        int a=5;
        int b=7;
        int c;
        c=logic(a,b);

//        Method invocation using object creation
//        methods_31 obj=new methods_31();
//        c=obj.logic(a,b);
        int a1=18;
        int b1=15;
        int c1=logic(a1,b1);
//        int c1=obj.logic(a1,b1);
        System.out.println(c);
        System.out.println(c1);
    }
}
