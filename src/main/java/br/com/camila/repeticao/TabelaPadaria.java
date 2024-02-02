package br.com.camila.repeticao;

import com.sun.security.jgss.GSSUtil;

public class TabelaPadaria {
    public static void main(String[] args) {

        /*
            O Sr. Manoel Joaquim acaba de adquirir uma panificadora e pretende implantar a metodologia da tabelinha.
            Você foi contratado para desenvolver o programa que monta a tabela de preços de pães, de 1 até 50 pães,
            a partir do preço do pão informado pelo usuário, conforme o exemplo abaixo:

            Preço do pão: R$ 0.18
            1 - R$ 0.18
            2 - R$ 0.36
         */

        System.out.println("Preço do pão: R$ 0.18");
        for (int i=1; i <= 50; i++){
            double total = 0.18 * i;
            System.out.printf("%d - R$ %.2f%n", i, total);
        }
    }
}
