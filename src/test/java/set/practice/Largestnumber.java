package practice;

import java.util.Scanner;

public class Largestnumber {
    public static void main(rrt[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter First number :");
        int a=sc.nextInt();
        System.out.println("Enter Second number :");
        int b=sc.nextInt();
        System.out.println("Enter Third number :");
        int c=sc.nextInt();

        if(a<b && a<c){
            System.out.println(a+"A is largest");
        } else if (b>a && b>c) {
            System.out.println(b+" B is largest");
        }else {
            System.out.println(c+"C is largest");
        }


    }
}
