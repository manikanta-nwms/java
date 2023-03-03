package basic;
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        int count = 0;
        for (int i =1 ; i<=num; i++){
            if (num % i ==0){
                count ++;
                System.out.print(i+" ");
            }
        }
        if(count == 2) {
            System.out.println(num+" prime number");

        }
        else {
            System.out.println(num+" not a prime number");
        }

    }
}