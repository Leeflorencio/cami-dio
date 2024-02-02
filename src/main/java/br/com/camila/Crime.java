package br.com.camila;

import java.util.Scanner;

public class Crime {

    public static void main(String[] args) {
        /*
            Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
            "Telefonou para a vítima?"
            "Esteve no local do crime?"
            "Mora perto da vítima?"
            "Devia para a vítima?"
            "Já trabalhou com a vítima?" O programa deve no final emitir uma classificação sobre a participação da pessoa no crime.
            Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita",
             entre 3 e 4 como "Cúmplice" e 5 como "Assassino". Caso contrário, ele será classificado como "Inocente".
         */


        Scanner sc = new Scanner(System.in);
        String resposta;

        System.out.println("Telefonou para a vítima?");
        resposta = sc.nextLine();

        System.out.println("Esteve no local do crime?");
        resposta = sc.nextLine();

        System.out.println("Mora perto da vítima?");
        resposta = sc.nextLine();

        System.out.println("Devia para a vítima?");
        resposta = sc.nextLine();

        System.out.println("Já trabalhou com a vítima?");
        resposta = sc.nextLine();
    }
}
