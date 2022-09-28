package BootcampPhilips.Teste4;

import java.io.IOException;
import java.util.Scanner;


public class Problem {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        for (int i = 1; i <= N; i++) {
            //TODO: Complete os espaços em branco para obter o quadrado e o cubo de "i".
            int iAoQuadrado = (int) Math.pow(i, 2);
            int iAoCubo = (int) Math.pow(i, 3);
            int iAQuarta = (int) Math.pow(i, 4);
            int iAQuinta = (int) Math.pow(i, 5);

            System.out.println(i + " " + iAoQuadrado + " " + iAoCubo);

        }
    }

}
