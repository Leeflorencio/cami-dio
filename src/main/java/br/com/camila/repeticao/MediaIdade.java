package br.com.camila.repeticao;

import java.util.Scanner;

public class MediaIdade {

    public static void main(String[] args) {
        /*
            Faça um programa que peça para n pessoas a sua idade, ao final o programa devera
            verificar se a média de idade da turma varia entre 0 e 25,26 e 60 e maior que 60;
            e então, dizer se a turma é jovem, adulta ou idosa, conforme a média calculada.
         */

        Scanner sc = new Scanner(System.in);
        int pessoas = 5;
        int soma = 0;
        int media = 0;
        String mensagem;

        for (int i = 0; i <= pessoas; i++ ){
            System.out.println("Qual a sua idade?");
            int idade = sc.nextInt();
            soma += idade;
            media = soma / pessoas;
        }

        System.out.println("Média de idade da turma: " + media);
        System.out.println("-------------------");

        if(media >= 0 && media <= 25){
            mensagem = "A turma é consideravelmente jovem";
        } else if (media > 26 && media <= 60) {
            mensagem = "A turma é consideravelmente adulta";
        } else{
            mensagem = "A turma é consideravelmente idosa";
        }

        System.out.println(mensagem);

    }
}
