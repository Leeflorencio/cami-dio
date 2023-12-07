package br.com.camila.repeticao;

import java.util.Scanner;

public class Potenciacao {

    /*
        Faça um programa que peça dois números, base e expoente, calcule e mostre o primeiro número elevado ao segundo número.
        Não utilize a função de potência da linguagem.
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a base: ");
        int base = sc.nextInt();

        System.out.println("Digite o expoente: ");
        int expoente = sc.nextInt();

        int potencia = 1;
        for (int i = 0; i < expoente; i++) {
            potencia *= base;
        }

        System.out.println(potencia);

    }

}
