package basic;

public class IfElse {
    public static void main(String args[]){
        int number = 1;
        while (number <= 10){
            System.out.println(number);
            if(number%2 == 0){
                System.out.println("  its even number");
            }
            number += 1;
        }
    }
}
