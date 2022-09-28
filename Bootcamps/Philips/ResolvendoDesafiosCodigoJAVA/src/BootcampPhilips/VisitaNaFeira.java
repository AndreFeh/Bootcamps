package BootcampPhilips;

import java.util.Scanner;

public class VisitaNaFeira {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Pimentões Amarelos Que Recebeu: ");
        int a = scan.nextInt();

        System.out.println("Pimentões Vermelhos Que Recebeu: ");
        int b = scan.nextInt();


        int x = a + b;

        System.out.println("O Total De Pimentoes Na Sacola é de: " + x);

    }
}
