package br.com.camila;

import java.util.Scanner;

public class AlcoolGasolina {

    /*
        Um posto está vendendo combustíveis com a seguinte tabela de descontos:
        Álcool: até 20 litros, desconto de 3% por litro, acima de 20 litros, desconto de 5% por litro.
        Gasolina: até 20 litros, desconto de 4% por litro, acima de 20 litros, desconto de 6% por litro.

        Escreva um algoritmo que leia o número de litros vendidos, o tipo de combustível (codificado da seguinte forma: A-álcool, G-gasolina),
        calcule e imprima o valor a ser pago pelo cliente sabendo-se que o preço do litro da gasolina é R$ 2,50 o preço do litro do álcool é R$ 1,90.
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual combustível deseja abastecer? Digite A para alcool e G para gasolina");
        String combustivel = sc.next();

        System.out.println("Quantos litros deseja abastecer? ");
        Integer litro = sc.nextInt();


        if(combustivel.equalsIgnoreCase("a")){
            double valorTotal = litro * 1.90;
            if(litro > 0 && litro <= 20){
               double desconto =  (0.3 * valorTotal) * litro;
               double precoComDesconto = valorTotal - desconto;
               System.out.println("Valor do litro sem desconto: " + valorTotal);
               System.out.println("Valor com desconto: " + precoComDesconto);
            }
        }

    }
}
