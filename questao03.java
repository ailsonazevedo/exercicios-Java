import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

	System.out.println("Insira a quantidade de quilos:");
        Scanner entrada = new Scanner(System.in);
        String quantidadeQuilos = entrada.nextLine();
        int quantidadeQuilosConvertido = Integer.valueOf(quantidadeQuilos);


        if(quantidadeQuilosConvertido > 50)
        {
            double excesso = (quantidadeQuilosConvertido - 50) * 4;
            System.out.println("O valor da multa é:R$ "+ excesso + " Reais");
        }
        else
        {
            System.out.println("Sem excesso de peso!");
        }

    }
}