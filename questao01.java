import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

	Scanner entrada1 = new Scanner(System.in);

        System.out.print("Digite o valor a ser pago: ");
        int valorPago = entrada1.nextInt();
        System.out.print("Digite o valor do produto: ");
        int valorProduto = entrada1.nextInt();

        troco = valorPago - valorProduto;
        System.out.print("O valor do troco é de :"+ troco);

    }
}