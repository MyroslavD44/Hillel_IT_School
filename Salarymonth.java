package Dz3;

import java.util.Scanner;

public class Salarymonth {
    public static void main (String[] args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println("Give me please a number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        switch (number) {
            case 1:
            case 10:
                System.out.println(22 * 8 * a);
                System.out.println((22 * 8 * a) - 22 * 8 * a * b / 100);
                break;
            case 2:
                System.out.println(17 * 8 * a);
                System.out.println((17 * 8 * a) - 17 * 8 * a * b / 100);
            case 3:
            case 4:
            case 6:
            case 9:
            case 12:
                System.out.println(20 * 8 * a);
                System.out.println((20 * 8 * a) - 20 * 8 * a * b / 100);
                break;
            case 5:
                System.out.println(23 * 8 * a);
                System.out.println((23 * 8 * a) - 23 * 8 * a * b / 100);
                break;
            case 7:
                System.out.println(21 * 8 * a);
                System.out.println((21 * 8 * a) - 21 * 8 * a * b / 100);
                break;
            case 8:
            case 11:
                System.out.println(19 * 8 * a);
                System.out.println((19 * 8 * a) - 19 * 8 * a * b / 100);
                break;
            default:
                System.out.println("default block");













        }
















    }
}
