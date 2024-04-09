package com.esdraz.exercicios;

import java.util.Scanner;

public class Exercicio04_1 {

    public static void main(String[] args) {
        System.out.println("Desafio: estruturas de repetição\n");

        Scanner input = new Scanner(System.in);

        int soma = 0;
        for (int i = 1; i <= 4; i++) {
            System.out.print("Digite um número: ");
            int numero = input.nextInt();
            if (numero % 2 == 0) {
                soma += numero;
            } else {
                i--;
            }
        }
        System.out.println("total: " + soma);
    }
}
