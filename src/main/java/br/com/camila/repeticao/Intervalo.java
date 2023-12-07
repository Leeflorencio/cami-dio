package br.com.camila.repeticao;

import java.util.Scanner;

public class Intervalo {
    /*
        Faça um programa que receba dois números inteiros e gere
        os números inteiros que estão no intervalo compreendido por eles.
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número 1º: ");
        int numUm = sc.nextInt();

        System.out.println("Digite o número 2º: ");
        int numDois = sc.nextInt();

        System.out.println("Números em intervalo: ");


        if(numUm < numDois){
            for (int i = numUm; i <= numDois; i++){
                System.out.println(i);
            }
        } else{
            for (int i = numUm; i >= numDois; i--){
                System.out.println(i);
            }
        }
    }
}
