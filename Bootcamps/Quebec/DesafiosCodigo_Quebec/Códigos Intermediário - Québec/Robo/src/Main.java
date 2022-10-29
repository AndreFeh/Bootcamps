import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String movimentos = new Scanner(System.in).nextLine();

        //TODO. Em um jogo 2D existe um robô de limpeza que começa na posição (0,0).
        // Ele recebe alguns comandos através de uma sequência de movimentos.
        // Os movimentos válidos são: 'W' (movimento para cima), "S"(movimento para baixo), "D"(movimento para direita) e "A"(movimento para esquerda).
        // Você deverá verificar se após completar seus movimentos o robô se encontra na posição (0,0) novamente.
        // Retorne true se o robô retornar à origem ou false caso contrário.
        // Assuma que a magnitude do movimento do robô é a mesma para cada movimento.

        var movimentoX = 0;
        var movimentoY = 0;

        // TODO: Implemente os movimentos do Robô e verifique sua posição:
        /*O robô sobe uma vez e depois desce uma vez. Todos os movimentos têm a mesma magnitude, então acabou na origem onde começou. Portanto, retornamos true.*/

        for (int i = 0; i < movimentos.length(); i++)
        {
            char ch = movimentos.charAt(i);
            if (ch == 'W')
            {
                movimentoX++;
            }
            if (ch == 'S')
            {
                movimentoX--;
            }
            if (ch == 'D')
            {
                movimentoY++;
            }
            if (ch == 'A')
            {
                movimentoY--;
            }
        }

        if (movimentoX == 0 && movimentoY == 0)
        {
            System.out.print("true");
        }
        else
        {
            System.out.print("false");
        }

    }
}