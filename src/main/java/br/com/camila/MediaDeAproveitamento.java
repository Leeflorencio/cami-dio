package br.com.camila;

import java.util.Scanner;

public class MediaDeAproveitamento {

    /*
        Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina
        ao longo de um semestre, e calcule a sua média. A atribuição de conceitos obedece à tabela abaixo:
        Média de Aproveitamento  Conceito
          Entre 9.0 e 10.0        A
          Entre 7.5 e 9.0         B
          Entre 6.0 e 7.5         C
          Entre 4.0 e 6.0         D
          Entre 4.0 e zero        E
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota 1: ");
        Double nota1 = sc.nextDouble();

        System.out.println("Digite a nota 2: ");
        Double nota2 = sc.nextDouble();

        double media = (nota1 + nota2) / 2;
        String conceito = "";

        if(media >= 9.0 && media <= 10.0){
            conceito = "A " + " - APROVADO";
        } else if (media >= 7.5 && media <= 9.0 ) {
            conceito = "B " + " - APROVADO";
        } else if (media >= 6.0 && media <= 7.5) {
            conceito = "C " + " - APROVADO";
        } else if (media >= 4.0 && media <= 6.0) {
            conceito = "D " + " - REPROVADO";
        } else if (media >= 0 && media <= 4.0){
            conceito = "E " + " - REPROVADO";
        }

        System.out.println("Nota 1: " + nota1 + "\nNota 2: " + nota2 + "\n" + "Média: " + media);
        System.out.println("Conceito: " + conceito);
    }
}
