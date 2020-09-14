package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args)
    {
        Scanner entrada1 = new Scanner(System.in);


        EstoqueDeProdutos produto01 = new EstoqueDeProdutos();


        produto01.setNomeDoProduto("Arroz");
        produto01.setMarcaDoProduto("São Bernado");
        produto01.setNumeroDoLote(123);
        produto01.setPrecoDeCompra(15);
        produto01.setPrecoDeVenda(20);

        produto01.estoque();



    }

}

