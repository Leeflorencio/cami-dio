package br.com.camila.repeticao;

import java.util.Scanner;

public class Date {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String resposta;

        do{
            System.out.println("Aceita sair comigo? ");
            resposta = sc.next();

            if(!resposta.equalsIgnoreCase("sim")){
                System.out.println("Sua resposta está diferente do esperado... :(");
                continue;
            } else{
                System.out.println("UHUUUUUUUUU :)");
                break;
            }
        }while (true);
    }
}
