package br.com.camila.repeticao;

import java.util.Scanner;

public class CompeticaoSalto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] saltos = new double[5];
        String nome;
        double media = 0;
        double soma = 0;
        double melhorSalto = Double.MIN_VALUE;
        double piorSalto = Double.MAX_VALUE;

        System.out.println("Atleta: ");
        nome = sc.next();

        for (int i = 0; i < 5; i++) {
            System.out.print("Informe o " + (i + 1) + "º salto: ");
            saltos[i] = sc.nextDouble();

            if (saltos[i] > melhorSalto) {
                melhorSalto = saltos[i];
            }
            if (saltos[i] < piorSalto) {
                piorSalto = saltos[i];
            }
        }

        for (double salto : saltos) {
            soma += salto;
        }
        media = soma / saltos.length;

        System.out.println("Melhor salto: " + melhorSalto);
        System.out.println("Pior salto: " + piorSalto);
        System.out.println("Média dos demais saltos: " + media);

        System.out.println("Resultado final: ");
        System.out.println(nome + ": " + media);
    }
}
