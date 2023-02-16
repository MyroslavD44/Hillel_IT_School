package Dz2;

import java.util.Scanner;

public class Hours {
public static void main(String[] args){
    Scanner num = new Scanner(System.in);
    float first, second, third, result;
    System.out.println("Enter first num");
    first = num.nextFloat();
    System.out.println("Enter second num");
    second = num.nextFloat();
    System.out.println("Enter third num");
    third = num.nextFloat();
    System.out.println("При 40 робочих годин на тиждень з річною зарплатнею"
            + second + "та податком в" + third + "година часу коштує");
    System.out.println((second * third / 100 + second) / 1920);








}



}
