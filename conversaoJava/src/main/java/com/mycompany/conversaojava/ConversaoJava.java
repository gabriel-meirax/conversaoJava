package com.mycompany.conversaojava;

import java.util.Scanner;

/**
 *
 * @author Gabriel Meira
 */
public class ConversaoJava {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int opcao;
        int valor, valor1;

        do {
            System.out.println("Digite 1 para converter quilômetros em metros");
            System.out.println("Digite 2 para converter metros cúbicos em litros");
            System.out.println("Digite 3 para sair");
            System.out.print("Opção: ");
            opcao = leitor.nextInt();
            
            if (opcao == 1) {
                System.out.println("Digite o valor do quilômetro a ser convertido para metros");
                System.out.print("valor : ");
                valor = leitor.nextInt();

                valor1 = valor * 1000;
                System.out.println(valor + " quilômetros equivale a " + valor1 + " metros");
            } else if (opcao == 2) {
                System.out.println("Digite o valor da quantidade de metros cúbicos a ser convertido em litros");
                System.out.print("valor : ");
                valor = leitor.nextInt();
                
                valor1 = valor * 1000;
                System.out.println(valor + " metros cúbicos equivale a " + valor1 + " litros");
            }
        } while (opcao < 3);
        System.out.println("Até mais!!");
        // o código foi commitado agora diretamente pelo git bash, tentei diretamente pela NetBeans, mas tive problemas por conta da autenticação de dois fatores.
    }
}
