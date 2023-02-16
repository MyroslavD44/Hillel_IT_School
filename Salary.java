package Dz2;

import java.util.Scanner;

public class Salary {
public static void main(String[] args){
    Scanner num = new Scanner(System.in);
    float first, second, third, result, result2;
    System.out.println("Enter first num");
    first = num.nextFloat();
    System.out.println("Enter second num");
    second = num.nextFloat();
    System.out.println("Enter third num");
    third = num.nextFloat();
    result = 4 * first * second;
    result2 = 48 * first * second;
    System.out.println(4 * first * second);
    System.out.println(4 * first * second - (result * third / 100));
    System.out.println(48 * first * second);
    System.out.println(48 * first * second - (result2 * third / 100));







}
}
