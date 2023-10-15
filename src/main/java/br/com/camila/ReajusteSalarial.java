package br.com.camila;

import java.util.Scanner;

public class ReajusteSalarial {

    /*
        As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores
        e lhe contraram para desenvolver o programa que calculará os reajustes.
        Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual:
        salários até R$ 280,00 (incluindo) : aumento de 20%
        salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
        salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
        salários de R$ 1500,00 em diante : aumento de 5%
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o seu salário: ");
        Double salario = sc.nextDouble();

        String resultado = "";

        if(salario <= 280){
            double salarioReajustado = salario * 0.2;
            double  salarioTotal = salarioReajustado + salario;
            resultado = "Salário: " + salario + "\nAumento de 20% \n" + "Valor do reajuste "
                    + salarioReajustado + "\nSalário total: " + salarioTotal;
            System.out.println(resultado);
        } else if (salario > 280 && salario <= 700 ) {
            double salarioReajustado = salario * 0.15;
            double salarioTotal = salarioReajustado + salario;
            resultado = "Salário: " + salario + "\nAumento de 15% \n" + "Valor do reajuste "
                    + salarioReajustado + "\nSalário total: " + salarioTotal;
            System.out.println(resultado);
        } else if (salario > 700 && salario <= 1500) {
            double salarioReajustado = salario * 0.1;
            double  salarioTotal = salarioReajustado + salario;
            resultado = "Salário: " + salario + "\nAumento de 10% \n" + "Valor do reajuste "
                    + salarioReajustado + "\nSalário total: " + salarioTotal;
            System.out.println(resultado);
        } else if (salario > 1500) {
            double salarioReajustado = salario * 0.05;
            double  salarioTotal = salarioReajustado + salario;
            resultado = "Salário: " + salario + "\nAumento de 5% \n" + "Valor do reajuste "
                    + salarioReajustado + "\nSalário total: " + salarioTotal;
            System.out.println(resultado);
        }
    }
}
