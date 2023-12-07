package br.com.camila.repeticao;

import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
            Faça um programa que leia 5 números e informe a soma e a média dos números.

        int soma = 0;
        int media = 0;

        for (int i = 0; i <= 5; i++){
            soma += i;
            media = soma / 5;
            System.out.print(" " + i);
        }

        System.out.println(" \nSoma total dos números: " + soma);
        System.out.println("Media: " + media);
        */

        int[] numeros = new int[5];
        int soma = 0;
        int media = 0;

        for (int i = 0; i < 5; i++){
            System.out.println("Informe o " + (i + 1) + "º número");
            numeros[i] = sc.nextInt();
        }

        for (int numero: numeros) {
            soma += numero;
            media = soma / 5;
        }
            System.out.println("Média: " + media);
            System.out.println("Soma: " + soma);
    }
}
