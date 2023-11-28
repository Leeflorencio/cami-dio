package br.com.camila;

import java.util.Scanner;

public class Fruteira {

    public static void main(String[] args) {

        /*
            Uma fruteira está vendendo frutas com a seguinte tabela de preços:
                                Até 5 Kg              Acima de 5 Kg
            Morango         R$ 2,50 por Kg          R$ 2,20 por Kg
            Maçã            R$ 1,80 por Kg          R$ 1,50 por Kg

            Se o cliente comprar mais de 8 Kg em frutas
             ou o valor total da compra ultrapassar R$ 25,00, receberá ainda um desconto de 10% sobre este total.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe qual fruta deseja comprar: \n Digite Maça ou Morango ");
        String fruta = sc.next();

        System.out.println("Informe a quantidade de kg da fruta: ");
        Integer kg = sc.nextInt();
        double valorTotal = 0.0;

        if (fruta.equalsIgnoreCase("morango")) {
            if (kg <= 5) {
                valorTotal = kg * 2.50;
            } else {
                valorTotal = kg * 2.20;
            }
        } else if (fruta.equalsIgnoreCase("maça")) {
            if (kg <= 5) {
                valorTotal = kg * 1.80;
            } else {
                valorTotal = kg * 1.50;
            }
        }

        if (kg > 8 || valorTotal > 25.0) {
            double desconto = 0.1 * valorTotal;
            valorTotal -= desconto;
        }
        System.out.println("valor total: " + valorTotal);

    }
}
