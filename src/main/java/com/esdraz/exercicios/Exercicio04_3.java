package com.esdraz.exercicios;

import java.util.Scanner;

public class Exercicio04_3 {

    public static void main(String[] args) {

        System.out.println("Desafio: estruturas de repetição\n");
        Scanner input = new Scanner(System.in);

        int soma = 0;

        while (soma < 100) {
            System.out.print("Digite um número: ");
            int num = input.nextInt();

            soma += num;
        }

//      Outra forma de resolver o problema
/*        while (true) {
            System.out.print("Digite um número: ");
            int num = input.nextInt();

            soma += num;
            if (soma >= 100) {
                break;
            }
        }*/

        System.out.printf("A soma é igual a: %d", soma);
    }
}