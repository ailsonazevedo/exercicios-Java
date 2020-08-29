import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

	int quantidadeQuadrados = 0;
        int j;

        Scanner entrada1 = new Scanner(System.in);

        do {
            System.out.print("Insira um número: ");
            j = entrada1.nextInt();
            if(j >= -10_000 && j <= 10_000 && j != 0)
            {
                double resul = Math.sqrt(j);
                quantidadeQuadrados += (int) resul == Double.valueOf(resul) ? 1 : 0;
            }
        } while(j != 0);

        System.out.println(quantidadeQuadrados);
    }
}