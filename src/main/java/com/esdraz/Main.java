package com.esdraz;

import com.esdraz.exercicios.Exercicio01;
import com.esdraz.exercicios.Exercicio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcao = 0;

        while (opcao != 4) {
            System.out.print("Digite entre 1 e 99 para Exercícios ou 4 para sair!\n");
            System.out.print("Número do exercício: ");
            Scanner input = new Scanner(System.in);
            opcao = input.nextInt();

            switch (opcao) {
                case 1 -> Exercicio01.main(null);
                case 2 -> Exercicio02.main(null);
                case 4 -> System.out.println("Saindo...");
                default -> System.out.println("Opcão invalida!");
            }
        }
    }
}