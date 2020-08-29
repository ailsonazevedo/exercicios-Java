import java.util.Scanner;


public class Main {

    public static void main(String[] args)
    {
        Scanner entrada1 = new Scanner(System.in);

        System.out.print("Digite o valor de m: ");
        int m = entrada1.nextInt();

        if(m<10) {

            int fatorial = calcFatorial(m);

        }
        
    }
    public static int divisivel(int div)
    {
        double n1 = 1, n2 = 2;
        if(n1 >= 1 && n2 > 2){
            div = "O numero é divisivel";
            return div;

        }
        else{
            div = "O numero não é divisivel";
            return div;
        }
    }