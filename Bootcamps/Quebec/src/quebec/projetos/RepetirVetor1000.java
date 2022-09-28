package quebec.projetos;

import java.util.Scanner;

public class RepetirVetor1000 {

    public RepetirVetor1000() {
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int t = leitor.nextInt();
        int[] n = new int[1000];
        int pos = 0;

        int i;
        while(pos < 999) {
            for(i = 0; i < t && pos <= 999; ++i) {
                n[pos] = i;
                ++pos;
            }
        }

        for(i = 0; i < n.length; ++i) {
            System.out.println("N[" + i + "] = " + n[i]);
        }

    }
}
