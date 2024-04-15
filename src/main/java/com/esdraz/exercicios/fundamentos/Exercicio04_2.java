package com.esdraz.exercicios.fundamentos;

import java.util.Scanner;

public class Exercicio04_2 {

    public static void main(String[] args) {

        System.out.println("Desafio: estruturas de repetição\n");
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = input.nextInt();
        boolean ePrimo = true;

        // qualquer divisior do número maior que sua raiz quadrada é multiplo de um divisor menor ja testado, por isso
        // número está sendo divisido por sua raiz.
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                ePrimo = false;
                break;
            }
        }

        if (ePrimo && num > 1) {
            System.out.printf("%d é um número primo!", num);
        } else {
            System.out.printf("%d não é um número primo!", num);
        }
        System.out.println();
    }
}