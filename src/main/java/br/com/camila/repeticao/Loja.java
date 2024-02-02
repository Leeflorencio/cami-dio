package br.com.camila.repeticao;

import java.util.Scanner;

public class Loja {
    public static void main(String[] args) {

        /*
            O Sr. Manoel Joaquim expandiu seus negócios para além dos negócios de 1,99 e agora possui uma loja de conveniências.
            Faça um programa que implemente uma caixa registradora rudimentar.
            O programa deverá receber um número desconhecido de valores referentes aos preços das mercadorias.
            Um valor zero deve ser informado pelo operador para indicar o final da compra.
            O programa deve então mostrar o total da compra e perguntar o valor em dinheiro que o cliente forneceu,
             para então calcular e mostrar o valor do troco. Após esta operação, o programa deverá voltar ao ponto inicial,
             para registrar a próxima compra.
         */

        Scanner sc = new Scanner(System.in);
        double valor = 0;
        double dinheiro = 0;
        double troco = 0;
        int i = 1;
        double total = 0;

        do {
            System.out.print("Produto " + (i++) + ": R$ ");
            valor = sc.nextDouble();
            total += valor;
            if (valor == 0) {
                System.out.println("Encerrando a compra...");
                break;
            }
        } while (true);


        System.out.println("Total: R$ " + total);

        System.out.print("Dinheiro: R$ ");
        dinheiro = sc.nextDouble();

        troco = dinheiro - total;
        System.out.println("Troco: R$ " + troco);
    }
}
