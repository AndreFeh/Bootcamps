package quebec.projetos;

public class Par {
    public static void main(String[] args) {
        int[] estrutura2 = new int[]{2, 3, 5, 8, 11, 13, 18, 34};
        int par = 0;

        for(int i = 0; i < 8; ++i) {
            if (estrutura2[i] % 2 == 0) {
                ++par;
            }
        }

        System.out.printf("%d é Par \n", par);
    }
}
