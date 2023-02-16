package Dz3;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args){
        int temp;
         boolean isPrime = true;
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = reader.nextInt();
        if (num % 2 == 0) System.out.println(num + " is even");
        else System.out.println(num + " is odd");
        if (num > 0) System.out.println(num + " is positive");
        else System.out.println(num + " is negative");
        for (int i = 2; i <= num;i++){
            temp = num % i;
            if (temp == 0){
                isPrime = false;
                break;
            }
        }
if (isPrime) {
    System.out.println(num + " просте число");
}else{
    System.out.println(num + " складне число");

}










    }
}
