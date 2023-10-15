package br.com.camila;

import java.util.Scanner;

public class PrecoProdutos {

    /*
        Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar,
        sabendo que a decisão é sempre pelo mais barato.
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor dos produtos 1, 2 e 3: ");

        Double produtoUm = sc.nextDouble();
        Double produtoDois = sc.nextDouble();
        Double produtoTres = sc.nextDouble();

        double menorPreco = 0;

        if(produtoUm < produtoDois && produtoUm < produtoTres){
            menorPreco = produtoUm;
        } else if (produtoDois < produtoTres && produtoDois < produtoUm) {
            menorPreco = produtoUm;
        } else{
            menorPreco = produtoTres;
        }

        System.out.println("Valores dos três produtos: " + produtoUm + " , " + produtoDois + " , " + produtoTres);
        System.out.println("Você deve comprar o produto mais barato de R$" + menorPreco);
    }
}
