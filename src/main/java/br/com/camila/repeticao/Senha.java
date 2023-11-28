package br.com.camila.repeticao;

import java.util.Scanner;

public class Senha {
    /*
       Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário,
       mostrando uma mensagem de erro e voltando a pedir as informações.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String senha;
        String nome;
        System.out.println("Digite seu nome: ");
        nome = sc.next();

        do{
            System.out.println("Informe sua senha: ");
            senha = sc.next();

            if(senha.equalsIgnoreCase(nome)){
                System.out.println("A senha não pode ser igual ao nome do usuário. Tente novamente!");
                continue;
            } else {
                System.out.println("Usuário e senha salvos!");
                break;
            }
        } while (true);
    }
}
