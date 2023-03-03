package basic;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first natural numbers");
        int n = sc.nextInt();
        int sum = (n*(n+1))/2;
        System.out.println(sum);
    }
}
