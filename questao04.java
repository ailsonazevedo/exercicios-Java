import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

	Scanner scanner = new Scanner (System.in);

        int num01;
        System.out.print("Informe o valor de n° ->");
        num01 = scanner.nextInt();

        double S = 2.666666666666667;
        int fat_N = Fatorial(num01);
        double funcao = (S + 1/fat_N);
        System.out.println("Resultado =" + funcao);
    }
    public static int Fatorial(int num02)
    {
        int N = 0;

        for(int i = 1; i <= num02; i++){
            N = N * i;
        }
        return N;
    }
    }
}