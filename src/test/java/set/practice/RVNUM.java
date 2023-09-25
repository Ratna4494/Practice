package practice;

import java.util.Scanner;

public class RVNUM {
    public static void main(rrt[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter number:");
       int n =sc.nextInt();
        int rev=0;
        while(n!=0){
            rev=rev*10+n%10;
            n=n/10;
        }
        System.out.println(rev);
    }
}
