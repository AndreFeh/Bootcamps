package BootcampPhilips.Teste3;

import java.util.Scanner;

public class Problem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int multiplosDe2 = 0, multiplosDe3 = 0, multiplosDe4 = 0, multiplosDe5 = 0;

        for (int i = 0; i < n; i++) {
            int li = sc.nextInt();
            if (li % 2 == 0) {
                multiplosDe2++;
            }
            if (li % 3 == 0) {
                multiplosDe3++;
            }
            if (li % 4 == 0) {
                multiplosDe4++;
            }
            if (li % 5 == 0) {
                multiplosDe5++;
            }
            //TODO: Complete a solução criando as condições e incrementos para os múltiplos de 4 e 5.
        }

        System.out.printf("%d Multiplo(s) de 2\n", multiplosDe2);
        System.out.printf("%d Multiplo(s) de 3\n", multiplosDe3);
        System.out.printf("%d Multiplo(s) de 4\n", multiplosDe4);
        System.out.printf("%d Multiplo(s) de 5\n", multiplosDe5);

    }
}