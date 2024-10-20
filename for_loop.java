import java.util.Arrays;
import java.util.Scanner;

public class for_loop {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int i = sc.nextInt();
//        for( i=1;i<=20;i++){
//            System.out.println(2*i+1);
//        }
        int [] marks={24,65,85,72,48};
/*
        System.out.println(marks.length);
        Displaying the array (Naive way)
*/
/*
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
*/
//        Displaying using for loop
        Arrays.sort(marks);
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
//        Displaying the Array in Reverse order
        for(int i=marks.length-1;i>=0;i--){
            System.out.println(marks[i]);
        }
//        Displaying the Array using for each loop
        for(int element:marks){
            System.out.println(element);
        }
    }
}
