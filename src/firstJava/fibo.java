package firstJava;

import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibS(n));
    }
    static int fibS(int n){
        int a = 0;
        int b = 1;
        if(n == 1 || n ==2) return n-1;
        int count = 2 ;
        while(count<n){
            int temp = b;
            b = b+a;
            System.out.println(b);
            a=temp;
            count++;
        }
        return b;
    }
}
