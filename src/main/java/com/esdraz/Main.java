package com.esdraz;

import com.esdraz.exercicios.fundamentos.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcao = 0;

        while (opcao != 99) {
            System.out.print("Digite entre 1 e 98 para Exercícios ou 99 para sair!\n");
            System.out.print("Número do exercício: ");
            Scanner input = new Scanner(System.in);
            opcao = input.nextInt();

            switch (opcao) {
                case 1 -> Exercicio01.main(null);
                case 2 -> Exercicio02.main(null);
                case 3 -> Exercicio03.main(null);
                case 4 -> Exercicio04_1.main(null);
                case 5 -> Exercicio04_2.main(null);
                case 99 -> System.out.println("Saindo...");
                default -> System.out.println("Opcão invalida!");
            }
        }
    }
}