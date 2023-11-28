package br.com.camila.repeticao;

import java.util.ArrayList;
import java.util.Scanner;

public class Validacao {

    public static void main(String[] args) {
        /*
            Faça um programa que leia e valide as seguintes informações:
            Nome: maior que 3 caracteres;
            Idade: entre 0 e 150;
            Salário: maior que zero;
            Sexo: 'f' ou 'm';
            Estado Civil: 's', 'c', 'v', 'd';
         */

        Scanner sc = new Scanner(System.in);

        String nome;
        while (true) {
            System.out.println("Digite seu nome: ");
            nome = sc.next();

            if(nome.length() < 3){
                System.out.println("O nome precisa conter mais de 3 caracteres. Tente novamente!");
                continue;
            } else {
                System.out.println("Nome cadastrado");
                break;
            }
        }

        System.out.println("---------------------------------");

        int idade;
        do{
            System.out.println("Digite a sua idade: ");
            idade = sc.nextInt();

            if(idade < 0 || idade > 150){
                System.out.println("Idade inválida");
                continue;
            } else{
                System.out.println("Idade: " + idade);
                break;
            }
        }while (true);


        System.out.println("---------------------------------");

        double salario;
        while(true){
            System.out.println("Digite seu salario: ");
            salario = sc.nextDouble();

            if (salario <= 0){
                System.out.println("O salario deve ser maior que R$0,00");
            } else {
                System.out.println("Salario: " + salario);
                break;
            }
        }

        System.out.println("---------------------------------");

        String sexo;
        do{
            System.out.println("Digite o seu sexo: F (feminino), M (masculino)");
            sexo = sc.next();

            if(sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")){
                break;
            } else{
                System.out.println("Dado invalido. Tente novamente!");
            }
        }while (true);


        System.out.println("---------------------------------");

        String estadoCivil;

        //Estado Civil: 's', 'c', 'v', 'd';
        do{
            System.out.println("Digite o seu estado civil: S (solteiro), C (casado), V (viuvo), D (divorciado)");
            estadoCivil = sc.next();

            if(estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c")
                    || estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d")){
                break;
            } else {
                System.out.println("Estado civil inválido. Tente novamente! ");
            }
        }while (true);
    }
}
