package com.esdraz.exercicios;

import java.util.Scanner;

public class Exercicio04_5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int somaImpares = 0;
        int somaPares = 0;
        String opcao;

        do {
            System.out.print("Digite um número: ");
            int num = input.nextInt();
            input.nextLine();

            System.out.print("Deseja continuar? (s/n): ");
            opcao = input.next();

            if (num % 2 == 0) {
                somaPares += num;
            } else {
                somaImpares += num;
            }

        } while (opcao.equals("s"));

        System.out.printf("A soma dos números pares é: %d\n" +
                "A soma dos números impares é: %d", somaPares, somaImpares);
    }
}