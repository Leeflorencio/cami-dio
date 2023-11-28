package br.com.camila;

import java.util.Scanner;

public class SomaEMultiplicacaoDeNumeros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[3];

        int contador = 0;
        while(contador < 3){
            System.out.println("Informe o " + (contador + 1) + "º número");
            numeros[contador] = sc.nextInt();
            contador++;
        }

        System.out.println("Todos os números: ");
        for (int numero : numeros){
            System.out.println(numero + " ");
        }

        int soma = 0;
        int multiplicacao = 1;

        for (int numero : numeros){
            soma += numero;
            multiplicacao *= numero;
        }
    }
}
