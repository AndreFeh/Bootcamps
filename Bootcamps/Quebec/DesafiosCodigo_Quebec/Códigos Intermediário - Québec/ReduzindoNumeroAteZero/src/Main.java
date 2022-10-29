import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int num = Integer.parseInt(new Scanner(System.in).nextLine());
        int etapas = 0;

        while (num > 0) { /*Enquanto Numero Maior que Zero*/

            if (num % 2 != 0) { /*Se o fim da divisao de 2 é Diferente de 0, Subtraia 1 (Para Tornar Par)*/
                num--;
                etapas++;
            } else if (num % 2 == 0) { /*Se o fim da divisao de 2 é 0, Divida por 2, acrescente uma etapa*/
                num /= 2;
                etapas++;
            }
        }

        System.out.println(etapas);
    }
}