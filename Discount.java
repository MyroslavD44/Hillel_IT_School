package Dz3;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        int a = Integer.parseInt(args[0]);
        System.out.println("Вкажіть кількість товару");
        float first = num.nextFloat();
        if ((first > 10) && (first < 20)){
            System.out.println((first * a) - first * a * 5 /100);
        }else if ((first > 20) && (first < 30)){
            System.out.println((first * a) - first * a * 10 /100);
        }else if ((first > 30) && (first < 40)){
            System.out.println((first * a) - first * a * 12 /100);
        }else if ((first > 40) && (first < 50)){
            System.out.println((first * a) - first * a * 12.4 /100);
        }else if ((first > 50) && (first < 60)){
            System.out.println((first * a) - first * a * 12.8 /100);
        }else if ((first > 60) && (first < 70)){
            System.out.println((first * a) - first * a * 13.2 /100);
        }else if ((first > 70) && (first < 80)){
            System.out.println((first * a) - first * a * 13.6 /100);
        }else if (first > 80){
            System.out.println((first * a) - first * a * 13 /100);
        }

















    }




}
