package com.esdraz.exercicios.fundamentos;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        System.out.println("Desafio: operadores de igualdade e lógicos\n");

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um ano (ex: 1991): ");
        int ano = input.nextInt();

/*        if (ano % 400 == 0 || ano % 4 == 0 && ano % 100 != 0) {

            System.out.println("O ano é Bissexto");
        } else {
            System.out.println("O ano não é Bissexto");
        }*/

        boolean anoBissexto = ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0);
        System.out.printf("Ano Bissexto: %b%n", anoBissexto);
        System.out.println();
    }
}
