package ddd;

import java.util.Scanner;

public class CalculaMedia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("*-- Calcula Média *--");

        System.out.println("N1:");
        float n1 = input.nextFloat();
        System.out.println("N2:");
        float n2 = input.nextFloat();
        System.out.println("N3:");
        float n3 = input.nextFloat();

        float media = (n1+n2+n3)/3;
        System.out.println("Média:" + media);


    }
}
