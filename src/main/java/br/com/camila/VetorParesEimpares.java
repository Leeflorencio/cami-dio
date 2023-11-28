package br.com.camila;

import java.util.Scanner;

public class VetorParesEimpares {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++){
            System.out.println("Informe o " + (i+1) + "º número: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("Todos os números informados: ");
        for (int numero : numeros){
            System.out.println(numero + " ");
        }

        System.out.println("Todos os números pares informados: ");
        for (int numero : numeros){
            if(numero % 2 == 0){
                System.out.println(numero + " ");
            }
        }

        System.out.println("Todos os números ímpares informados: ");
        for (int numero : numeros){
            if (numero % 2 != 0){
                System.out.println(numero + " ");
            }
        }
    }
}
