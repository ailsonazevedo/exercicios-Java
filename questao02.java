import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

	System.out.println("Insira o valor de A:");
        Scanner entrada1 = new Scanner(System.in);
        String valorA = entrada1.nextLine();
        double valorAConvertido = Double.valueOf(valorA);

        System.out.println("Insira o valor de B:");
        Scanner entrada2 = new Scanner(System.in);
        String valorB = entrada2.nextLine();
        double valorBConvertido = Double.valueOf(valorB);

        System.out.println("Insira o valor de C:");
        Scanner entrada3 = new Scanner(System.in);
        String valorC = entrada3.nextLine();
        double valorCConvertido = Double.valueOf(valorC);

        double delta = (valorBConvertido*valorBConvertido) - (4*valorAConvertido*valorCConvertido);
        double x1 = (-valorBConvertido + Math.sqrt(Math.abs(delta))) / 2 * valorAConvertido;
        double x2 = (- valorBConvertido - Math.sqrt(Math.abs(delta))) / 2 * valorAConvertido;

        System.out.println("X' : " + x1);
        System.out.println("X'' : " + x2);

    }
}