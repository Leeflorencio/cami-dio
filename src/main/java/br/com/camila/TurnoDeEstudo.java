package br.com.camila;

import java.util.Scanner;

public class TurnoDeEstudo {

    /*
        Faça um Programa que pergunte em que turno você estuda. Peça para digitar M-matutino ou V-Vespertino ou N- Noturno.
        Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!"
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Em que turno você estuda? Digite: M-matutino, V-Vespertino ou N- Noturno." );
        String turno = sc.next();

        if(turno.equalsIgnoreCase("m")){
            System.out.println("Bom dia");
        } else if (turno.equalsIgnoreCase("v")) {
            System.out.println("Boa tarde");
        } else if (turno.equalsIgnoreCase("n")) {
            System.out.println("Boa noite");
        } else{
            System.out.println("Valor Inválido! Digite as opções válidas: M, V ou N");
        }

    }
}
