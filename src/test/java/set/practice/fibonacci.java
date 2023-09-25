package practice;

public class fibonacci {
    public static void main(rrt[] args) {
        int n1=0 ,n2=1, sum =0;
        System.out.print(n1+" "+n2);
        for(int i=2;i<8;i++){
            sum =n1+n2;
            System.out.print(" "+sum);
            n1=n2;
            n2=sum;
        }

    }
}
