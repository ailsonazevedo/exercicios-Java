import java.util.Scanner;


public class Main {

    public static void main(String[] args)
    {
        int rodadas;
        int jogadas = 2;
        int totalDePontos = 0;
        String strike = "x";
        int contadorDePontos[] = new int [10];

        System.out.println("           ----- American Boliche -----");

        Scanner entrada1 = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nomeJogador = entrada1.next();

       
        for(rodadas = 1; rodadas < 11; rodadas++)
        {
            System.out.println(rodadas + " Rodada");
            System.out.println("Insira a quantidade de pinos derrubados 1 Jogada: ");
            int jogada1 = entrada1.nextInt();
            if(jogada1 == 10)
            {
                System.out.println("Strike!! --> " + strike);
                totalDePontos += 10;
            }
            else
            {
                totalDePontos = totalDePontos + jogada1;
                System.out.println("Insira a quantidade de pinos derrubados na 2 jogada: ");
                int jogada2 = entrada1.nextInt();
                if(jogada2 == 10)
                    {
                        System.out.println("Strike!! --> " + strike);
                    }
                totalDePontos += jogada1 + jogada2;
            }


        }
        System.out.println("Nome: " + nomeJogador);
        System.out.println("Total - " + totalDePontos + " Pontos");


    }



}